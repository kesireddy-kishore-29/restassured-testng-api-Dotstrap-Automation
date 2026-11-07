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
| 1 | `POST /v1/accounts` | 201 | 49 | `qa-0a1d98b3-800c-4eee-89ae-d0ef3881ff63` |
| 2 | `POST /v1/accounts` | 201 | 44 | `qa-14ea9a7d-62cf-46fc-a291-28ae4beaf8e4` |
| 3 | `POST /v1/auth/token` | 200 | 53 | `qa-ebee65e4-ffd2-4a3d-9ab5-a3d09a6098f0` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-03e2f9fb-272c-47af-9671-efcbe0525fea` |
| 5 | `PATCH /v1/accounts/me` | 400 | 34 | `qa-a8954042-8b51-4ab5-8b27-83257139573a` |
| 6 | `POST /v1/auth/token` | 200 | 44 | `qa-6676368e-9ecf-4cff-bec9-a6c493ceaf9e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-4e3f325f-c90e-43f7-ba2c-730d3bb1697b` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-8d5687b8-b0d5-49d2-89fb-913f48f4f7c8` |
| 9 | `DELETE /v1/accounts/me` | 204 | 32 | `qa-211a6310-11b7-4c56-960a-682e48d203a6` |
| 10 | `POST /v1/auth/token` | 401 | 24 | `qa-a76a6a78-801d-4b50-ad2a-a787096823c1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0a1d98b3-800c-4eee-89ae-d0ef3881ff63

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a1d98b3-800c-4eee-89ae-d0ef3881ff63
Content-Type: application/json

--- request body ---
{"handle":"qa-e31a633c168c","displayName":"QA e31a633c168c","password":"****","region":"eu"}

--- response: 201 in 49 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-0a1d98b3-800c-4eee-89ae-d0ef3881ff63
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 501
RateLimit-Reset: 8
Location: /v1/accounts/qa-e31a633c168c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b0a85d0c-d7bc-4dfd-b192-9141b947dfd5","handle":"qa-e31a633c168c","displayName":"QA e31a633c168c","region":"eu","role":"user","createdAt":"2026-10-30T08:46:03.833052209Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-14ea9a7d-62cf-46fc-a291-28ae4beaf8e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-14ea9a7d-62cf-46fc-a291-28ae4beaf8e4
Content-Type: application/json

--- request body ---
{"handle":"qa-ca727680c3ea","displayName":"QA ca727680c3ea","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-14ea9a7d-62cf-46fc-a291-28ae4beaf8e4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 491
RateLimit-Reset: 8
Location: /v1/accounts/qa-ca727680c3ea
X-Served-Region: eu
Content-Length: 181

{"id":"acc_dda5f9a9-6f54-48c4-b9d6-1b24389d9f42","handle":"qa-ca727680c3ea","displayName":"QA ca727680c3ea","region":"eu","role":"user","createdAt":"2026-10-30T08:46:03.897115585Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ebee65e4-ffd2-4a3d-9ab5-a3d09a6098f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ebee65e4-ffd2-4a3d-9ab5-a3d09a6098f0
Content-Type: application/json

--- request body ---
{"handle":"qa-e31a633c168c","password":"****"}

--- response: 200 in 53 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-ebee65e4-ffd2-4a3d-9ab5-a3d09a6098f0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 481
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b0a85d0c-d7bc-4dfd-b192-9141b947dfd5"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-03e2f9fb-272c-47af-9671-efcbe0525fea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03e2f9fb-272c-47af-9671-efcbe0525fea
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ca727680c3ea","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-03e2f9fb-272c-47af-9671-efcbe0525fea
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
Location: /v1/conversations/cnv_eebf4686-6c15-4ea0-ae2c-1100e7a294bd
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_eebf4686-6c15-4ea0-ae2c-1100e7a294bd","subject":"Error contract","status":"open","region":"eu","participants":["qa-e31a633c168c","qa-ca727680c3ea"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-30T08:46:04.032487972Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-a8954042-8b51-4ab5-8b27-83257139573a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8954042-8b51-4ab5-8b27-83257139573a
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 34 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a8954042-8b51-4ab5-8b27-83257139573a
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

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts/me","correlationId":"qa-a8954042-8b51-4ab5-8b27-83257139573a"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-6676368e-9ecf-4cff-bec9-a6c493ceaf9e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6676368e-9ecf-4cff-bec9-a6c493ceaf9e
Content-Type: application/json

--- request body ---
{"handle":"qa-ca727680c3ea","password":"****"}

--- response: 200 in 44 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-6676368e-9ecf-4cff-bec9-a6c493ceaf9e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 461
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dda5f9a9-6f54-48c4-b9d6-1b24389d9f42"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4e3f325f-c90e-43f7-ba2c-730d3bb1697b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e3f325f-c90e-43f7-ba2c-730d3bb1697b
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4e3f325f-c90e-43f7-ba2c-730d3bb1697b
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
correlation: qa-8d5687b8-b0d5-49d2-89fb-913f48f4f7c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d5687b8-b0d5-49d2-89fb-913f48f4f7c8
Content-Type: application/json

--- request body ---
{"handle":"qa-ca727680c3ea","password":"****"}

--- response: 401 in 18 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8d5687b8-b0d5-49d2-89fb-913f48f4f7c8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 452
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8d5687b8-b0d5-49d2-89fb-913f48f4f7c8"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-211a6310-11b7-4c56-960a-682e48d203a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-211a6310-11b7-4c56-960a-682e48d203a6
Content-Type: application/json

--- response: 204 in 32 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-211a6310-11b7-4c56-960a-682e48d203a6
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
correlation: qa-a76a6a78-801d-4b50-ad2a-a787096823c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a76a6a78-801d-4b50-ad2a-a787096823c1
Content-Type: application/json

--- request body ---
{"handle":"qa-e31a633c168c","password":"****"}

--- response: 401 in 24 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a76a6a78-801d-4b50-ad2a-a787096823c1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 441
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a76a6a78-801d-4b50-ad2a-a787096823c1"}
```
