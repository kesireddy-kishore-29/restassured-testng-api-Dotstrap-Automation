# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[6]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 27 | `qa-21ef26d1-13ae-4827-8a7d-ced2514c67f0` |
| 2 | `POST /v1/accounts` | 201 | 44 | `qa-1a6115b6-4e44-4ecb-b5a4-1960209fe99e` |
| 3 | `POST /v1/auth/token` | 200 | 22 | `qa-d567e6b7-c362-494e-bc7d-4ab53bb9dc6b` |
| 4 | `POST /v1/conversations` | 201 | 29 | `qa-79be371c-90df-47cf-abf4-4548dd907a2e` |
| 5 | `PATCH /v1/accounts/me` | 400 | 9 | `qa-98aa7abc-815c-4709-a706-b12b4339d303` |
| 6 | `POST /v1/auth/token` | 200 | 17 | `qa-36a80c84-b5c7-4eed-9506-bfe081ebd591` |
| 7 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-19ccf58c-ad4c-44ef-81bb-40493f145a56` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-2b555c18-1317-4386-ba4c-68004d159544` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-b4a4b915-80b7-4114-9354-a7d91acd22ac` |
| 10 | `POST /v1/auth/token` | 401 | 11 | `qa-68dfe1aa-08fb-40fe-8408-07dddb927727` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-21ef26d1-13ae-4827-8a7d-ced2514c67f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-21ef26d1-13ae-4827-8a7d-ced2514c67f0
Content-Type: application/json

--- request body ---
{"handle":"qa-8d84466ae1a1","displayName":"QA 8d84466ae1a1","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-21ef26d1-13ae-4827-8a7d-ced2514c67f0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 507
RateLimit-Reset: 9
Location: /v1/accounts/qa-8d84466ae1a1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1b94b7f2-b5d4-41a4-a600-38e14e50767a","handle":"qa-8d84466ae1a1","displayName":"QA 8d84466ae1a1","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.393522143Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-1a6115b6-4e44-4ecb-b5a4-1960209fe99e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a6115b6-4e44-4ecb-b5a4-1960209fe99e
Content-Type: application/json

--- request body ---
{"handle":"qa-5202c2fb0dca","displayName":"QA 5202c2fb0dca","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-1a6115b6-4e44-4ecb-b5a4-1960209fe99e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 492
RateLimit-Reset: 9
Location: /v1/accounts/qa-5202c2fb0dca
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d6034fe6-bc71-4029-b105-468d6c78804c","handle":"qa-5202c2fb0dca","displayName":"QA 5202c2fb0dca","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.424504873Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d567e6b7-c362-494e-bc7d-4ab53bb9dc6b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d567e6b7-c362-494e-bc7d-4ab53bb9dc6b
Content-Type: application/json

--- request body ---
{"handle":"qa-8d84466ae1a1","password":"****"}

--- response: 200 in 22 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-d567e6b7-c362-494e-bc7d-4ab53bb9dc6b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 486
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1b94b7f2-b5d4-41a4-a600-38e14e50767a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-79be371c-90df-47cf-abf4-4548dd907a2e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79be371c-90df-47cf-abf4-4548dd907a2e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5202c2fb0dca","subject":"Error contract","message":"Hi"}

--- response: 201 in 29 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-79be371c-90df-47cf-abf4-4548dd907a2e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/conversations/cnv_e9476d89-2869-40e5-ab3d-d019e0dc76b4
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e9476d89-2869-40e5-ab3d-d019e0dc76b4","subject":"Error contract","status":"open","region":"eu","participants":["qa-8d84466ae1a1","qa-5202c2fb0dca"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-04T09:28:02.529382573Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-98aa7abc-815c-4709-a706-b12b4339d303

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98aa7abc-815c-4709-a706-b12b4339d303
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 9 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-98aa7abc-815c-4709-a706-b12b4339d303
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 256

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts/me","correlationId":"qa-98aa7abc-815c-4709-a706-b12b4339d303"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-36a80c84-b5c7-4eed-9506-bfe081ebd591

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-36a80c84-b5c7-4eed-9506-bfe081ebd591
Content-Type: application/json

--- request body ---
{"handle":"qa-5202c2fb0dca","password":"****"}

--- response: 200 in 17 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-36a80c84-b5c7-4eed-9506-bfe081ebd591
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 468
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d6034fe6-bc71-4029-b105-468d6c78804c"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-19ccf58c-ad4c-44ef-81bb-40493f145a56

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19ccf58c-ad4c-44ef-81bb-40493f145a56
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-19ccf58c-ad4c-44ef-81bb-40493f145a56
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-2b555c18-1317-4386-ba4c-68004d159544

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b555c18-1317-4386-ba4c-68004d159544
Content-Type: application/json

--- request body ---
{"handle":"qa-5202c2fb0dca","password":"****"}

--- response: 401 in 18 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2b555c18-1317-4386-ba4c-68004d159544
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 460
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2b555c18-1317-4386-ba4c-68004d159544"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b4a4b915-80b7-4114-9354-a7d91acd22ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4a4b915-80b7-4114-9354-a7d91acd22ac
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b4a4b915-80b7-4114-9354-a7d91acd22ac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-68dfe1aa-08fb-40fe-8408-07dddb927727

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68dfe1aa-08fb-40fe-8408-07dddb927727
Content-Type: application/json

--- request body ---
{"handle":"qa-8d84466ae1a1","password":"****"}

--- response: 401 in 11 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-68dfe1aa-08fb-40fe-8408-07dddb927727
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 456
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-68dfe1aa-08fb-40fe-8408-07dddb927727"}
```
