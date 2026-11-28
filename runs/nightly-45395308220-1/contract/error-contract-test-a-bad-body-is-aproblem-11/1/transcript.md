# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[11]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 37 | `qa-e48b8700-96bb-466e-bfd3-8c9b205b9f47` |
| 2 | `POST /v1/accounts` | 201 | 31 | `qa-cde5f949-16b2-4672-8f4c-c7387385b81e` |
| 3 | `POST /v1/auth/token` | 200 | 16 | `qa-19ccb7e0-2063-42fe-9cfb-62727dea8687` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-3d8b3e8b-946e-49ff-b281-08231f21d8b1` |
| 5 | `POST /v1/conversations` | 422 | 15 | `qa-ddc15018-9bbf-485d-8e2a-786f9616c297` |
| 6 | `POST /v1/auth/token` | 200 | 27 | `qa-3b04503a-3e38-4cb8-abb8-2c33b5b165ee` |
| 7 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-763c7510-7982-413f-844e-d107041fd627` |
| 8 | `POST /v1/auth/token` | 401 | 19 | `qa-0dcbc53d-1a47-474e-ba93-c189728171ee` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-49bb6fb3-45f3-44a9-aee7-a75dad9773d2` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-eb2b0228-ad79-409e-8e28-7dfc9c9d3772` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e48b8700-96bb-466e-bfd3-8c9b205b9f47

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e48b8700-96bb-466e-bfd3-8c9b205b9f47
Content-Type: application/json

--- request body ---
{"handle":"qa-9c0e242b690c","displayName":"QA 9c0e242b690c","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-e48b8700-96bb-466e-bfd3-8c9b205b9f47
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 398
RateLimit-Reset: 8
Location: /v1/accounts/qa-9c0e242b690c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8816e326-3cad-4130-ad20-a2d411d5345f","handle":"qa-9c0e242b690c","displayName":"QA 9c0e242b690c","region":"eu","role":"user","createdAt":"2026-11-24T12:38:15.132614715Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-cde5f949-16b2-4672-8f4c-c7387385b81e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cde5f949-16b2-4672-8f4c-c7387385b81e
Content-Type: application/json

--- request body ---
{"handle":"qa-c080200a836c","displayName":"QA c080200a836c","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-cde5f949-16b2-4672-8f4c-c7387385b81e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 391
RateLimit-Reset: 8
Location: /v1/accounts/qa-c080200a836c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_326748be-e444-45a3-90e1-c5d85fb5010c","handle":"qa-c080200a836c","displayName":"QA c080200a836c","region":"eu","role":"user","createdAt":"2026-11-24T12:38:15.171306111Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-19ccb7e0-2063-42fe-9cfb-62727dea8687

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19ccb7e0-2063-42fe-9cfb-62727dea8687
Content-Type: application/json

--- request body ---
{"handle":"qa-9c0e242b690c","password":"****"}

--- response: 200 in 16 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-19ccb7e0-2063-42fe-9cfb-62727dea8687
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 386
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8816e326-3cad-4130-ad20-a2d411d5345f"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-3d8b3e8b-946e-49ff-b281-08231f21d8b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d8b3e8b-946e-49ff-b281-08231f21d8b1
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c080200a836c","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d8b3e8b-946e-49ff-b281-08231f21d8b1
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
Location: /v1/conversations/cnv_7c506827-fa39-4ba7-a950-ead89cee5f1e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_7c506827-fa39-4ba7-a950-ead89cee5f1e","subject":"Error contract","status":"open","region":"eu","participants":["qa-9c0e242b690c","qa-c080200a836c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-24T12:38:15.225295238Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-ddc15018-9bbf-485d-8e2a-786f9616c297

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ddc15018-9bbf-485d-8e2a-786f9616c297
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c080200a836c","subject":" ","message":"Hi"}

--- response: 422 in 15 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ddc15018-9bbf-485d-8e2a-786f9616c297
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
Content-Length: 315

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations","correlationId":"qa-ddc15018-9bbf-485d-8e2a-786f9616c297","errors":[{"field":"subject","message":"1-120 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-3b04503a-3e38-4cb8-abb8-2c33b5b165ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b04503a-3e38-4cb8-abb8-2c33b5b165ee
Content-Type: application/json

--- request body ---
{"handle":"qa-c080200a836c","password":"****"}

--- response: 200 in 27 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-3b04503a-3e38-4cb8-abb8-2c33b5b165ee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 371
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_326748be-e444-45a3-90e1-c5d85fb5010c"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-763c7510-7982-413f-844e-d107041fd627

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-763c7510-7982-413f-844e-d107041fd627
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-763c7510-7982-413f-844e-d107041fd627
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
correlation: qa-0dcbc53d-1a47-474e-ba93-c189728171ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0dcbc53d-1a47-474e-ba93-c189728171ee
Content-Type: application/json

--- request body ---
{"handle":"qa-c080200a836c","password":"****"}

--- response: 401 in 19 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0dcbc53d-1a47-474e-ba93-c189728171ee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 360
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0dcbc53d-1a47-474e-ba93-c189728171ee"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-49bb6fb3-45f3-44a9-aee7-a75dad9773d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49bb6fb3-45f3-44a9-aee7-a75dad9773d2
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-49bb6fb3-45f3-44a9-aee7-a75dad9773d2
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
correlation: qa-eb2b0228-ad79-409e-8e28-7dfc9c9d3772

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb2b0228-ad79-409e-8e28-7dfc9c9d3772
Content-Type: application/json

--- request body ---
{"handle":"qa-9c0e242b690c","password":"****"}

--- response: 401 in 10 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-eb2b0228-ad79-409e-8e28-7dfc9c9d3772
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 348
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-eb2b0228-ad79-409e-8e28-7dfc9c9d3772"}
```
