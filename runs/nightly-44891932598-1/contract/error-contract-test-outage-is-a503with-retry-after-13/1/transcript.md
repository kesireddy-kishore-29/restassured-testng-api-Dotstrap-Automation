# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/credits/balance]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[13]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 36 | `qa-55632d5a-e58a-469c-acb5-4fcc5decb796` |
| 2 | `POST /v1/accounts` | 201 | 37 | `qa-03901817-4dab-44f8-92dd-af4567757908` |
| 3 | `POST /v1/auth/token` | 200 | 47 | `qa-e27e19aa-8063-43af-9e65-40e19c3dbd1a` |
| 4 | `POST /v1/conversations` | 201 | 21 | `qa-3e63724d-8f07-44b6-8415-94264a1f214f` |
| 5 | `GET /v1/credits/balance` | 503 | 26 | `qa-c1941b6c-843c-4c19-b3ba-e309a26b5756` |
| 6 | `POST /v1/auth/token` | 200 | 48 | `qa-fa9a7a08-8019-438b-90e8-ccd8900889b7` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-ae867ea6-7494-410c-8c0d-4a99f27f817e` |
| 8 | `POST /v1/auth/token` | 401 | 11 | `qa-069fd8ae-7de6-4c08-af87-8503c8d84087` |
| 9 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-30c57c02-00a9-4b06-9852-957eb7fc67a6` |
| 10 | `POST /v1/auth/token` | 401 | 29 | `qa-62d69713-4d54-42a7-bd05-ab6e162f4872` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-55632d5a-e58a-469c-acb5-4fcc5decb796

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-55632d5a-e58a-469c-acb5-4fcc5decb796
Content-Type: application/json

--- request body ---
{"handle":"qa-2b0e03f59b8d","displayName":"QA 2b0e03f59b8d","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-55632d5a-e58a-469c-acb5-4fcc5decb796
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 367
RateLimit-Reset: 6
Location: /v1/accounts/qa-2b0e03f59b8d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc2282fb-34a9-44f2-bc34-868d93d21ab6","handle":"qa-2b0e03f59b8d","displayName":"QA 2b0e03f59b8d","region":"eu","role":"user","createdAt":"2026-11-21T09:57:12.025765678Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-03901817-4dab-44f8-92dd-af4567757908

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03901817-4dab-44f8-92dd-af4567757908
Content-Type: application/json

--- request body ---
{"handle":"qa-449ac1fceb63","displayName":"QA 449ac1fceb63","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-03901817-4dab-44f8-92dd-af4567757908
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 364
RateLimit-Reset: 6
Location: /v1/accounts/qa-449ac1fceb63
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c905a5cf-f8a2-46cd-8aed-44f6b606fa70","handle":"qa-449ac1fceb63","displayName":"QA 449ac1fceb63","region":"eu","role":"user","createdAt":"2026-11-21T09:57:12.091304449Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e27e19aa-8063-43af-9e65-40e19c3dbd1a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e27e19aa-8063-43af-9e65-40e19c3dbd1a
Content-Type: application/json

--- request body ---
{"handle":"qa-2b0e03f59b8d","password":"****"}

--- response: 200 in 47 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-e27e19aa-8063-43af-9e65-40e19c3dbd1a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 355
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fc2282fb-34a9-44f2-bc34-868d93d21ab6"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-3e63724d-8f07-44b6-8415-94264a1f214f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e63724d-8f07-44b6-8415-94264a1f214f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-449ac1fceb63","subject":"Error contract","message":"Hi"}

--- response: 201 in 21 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-3e63724d-8f07-44b6-8415-94264a1f214f
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
Location: /v1/conversations/cnv_688b383f-fd9a-4ad1-a8e2-66cda133d791
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_688b383f-fd9a-4ad1-a8e2-66cda133d791","subject":"Error contract","status":"open","region":"eu","participants":["qa-2b0e03f59b8d","qa-449ac1fceb63"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-21T09:57:12.186739459Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-c1941b6c-843c-4c19-b3ba-e309a26b5756

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: f79a7437-ec65-45b2-8034-9afbc083ea79
X-Correlation-Id: qa-c1941b6c-843c-4c19-b3ba-e309a26b5756
Content-Type: application/json

--- response: 503 in 26 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c1941b6c-843c-4c19-b3ba-e309a26b5756
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 263

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/balance","correlationId":"qa-c1941b6c-843c-4c19-b3ba-e309a26b5756"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-fa9a7a08-8019-438b-90e8-ccd8900889b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa9a7a08-8019-438b-90e8-ccd8900889b7
Content-Type: application/json

--- request body ---
{"handle":"qa-449ac1fceb63","password":"****"}

--- response: 200 in 48 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-fa9a7a08-8019-438b-90e8-ccd8900889b7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 335
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c905a5cf-f8a2-46cd-8aed-44f6b606fa70"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ae867ea6-7494-410c-8c0d-4a99f27f817e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae867ea6-7494-410c-8c0d-4a99f27f817e
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ae867ea6-7494-410c-8c0d-4a99f27f817e
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
correlation: qa-069fd8ae-7de6-4c08-af87-8503c8d84087

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-069fd8ae-7de6-4c08-af87-8503c8d84087
Content-Type: application/json

--- request body ---
{"handle":"qa-449ac1fceb63","password":"****"}

--- response: 401 in 11 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-069fd8ae-7de6-4c08-af87-8503c8d84087
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 329
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-069fd8ae-7de6-4c08-af87-8503c8d84087"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-30c57c02-00a9-4b06-9852-957eb7fc67a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30c57c02-00a9-4b06-9852-957eb7fc67a6
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-30c57c02-00a9-4b06-9852-957eb7fc67a6
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
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-62d69713-4d54-42a7-bd05-ab6e162f4872

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62d69713-4d54-42a7-bd05-ab6e162f4872
Content-Type: application/json

--- request body ---
{"handle":"qa-2b0e03f59b8d","password":"****"}

--- response: 401 in 29 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-62d69713-4d54-42a7-bd05-ab6e162f4872
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 324
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-62d69713-4d54-42a7-bd05-ab6e162f4872"}
```
