# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[4]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-c3932f3e-b82c-4d39-a09e-a6ea9952ed04` |
| 2 | `POST /v1/accounts` | 201 | 17 | `qa-07915cc1-7699-41db-aa92-a2f8fab71740` |
| 3 | `POST /v1/auth/token` | 200 | 32 | `qa-c697e1ba-4a85-474c-9387-5433736aebb6` |
| 4 | `POST /v1/conversations` | 201 | 26 | `qa-26e08210-dfc4-412b-b8b5-a5c56ffeb536` |
| 5 | `POST /v1/accounts` | 415 | 16 | `qa-bc84b55d-7bbe-4da9-8b3d-00a09103fbdc` |
| 6 | `POST /v1/auth/token` | 200 | 29 | `qa-1abab40e-cdb6-4465-861a-0cb7b49ec784` |
| 7 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-c5889aae-fa20-4de3-afec-d98c55b8f3d4` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-32909bb4-f096-47f8-aac3-ccdc437e9223` |
| 9 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-087ce420-5479-4aa4-94f2-69bb3b586756` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-cffd8ae8-7215-43d4-8020-ec907548c459` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c3932f3e-b82c-4d39-a09e-a6ea9952ed04

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3932f3e-b82c-4d39-a09e-a6ea9952ed04
Content-Type: application/json

--- request body ---
{"handle":"qa-53dc78cb8727","displayName":"QA 53dc78cb8727","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-c3932f3e-b82c-4d39-a09e-a6ea9952ed04
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 506
RateLimit-Reset: 9
Location: /v1/accounts/qa-53dc78cb8727
X-Served-Region: eu
Content-Length: 181

{"id":"acc_37b83371-c288-4dd3-a53d-56801b91930a","handle":"qa-53dc78cb8727","displayName":"QA 53dc78cb8727","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.337270549Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-07915cc1-7699-41db-aa92-a2f8fab71740

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07915cc1-7699-41db-aa92-a2f8fab71740
Content-Type: application/json

--- request body ---
{"handle":"qa-1e332587fd39","displayName":"QA 1e332587fd39","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-07915cc1-7699-41db-aa92-a2f8fab71740
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 494
RateLimit-Reset: 9
Location: /v1/accounts/qa-1e332587fd39
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e683a588-2ff3-4330-84f2-da0a979976f8","handle":"qa-1e332587fd39","displayName":"QA 1e332587fd39","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.363997948Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c697e1ba-4a85-474c-9387-5433736aebb6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c697e1ba-4a85-474c-9387-5433736aebb6
Content-Type: application/json

--- request body ---
{"handle":"qa-53dc78cb8727","password":"****"}

--- response: 200 in 32 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-c697e1ba-4a85-474c-9387-5433736aebb6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 485
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_37b83371-c288-4dd3-a53d-56801b91930a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-26e08210-dfc4-412b-b8b5-a5c56ffeb536

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26e08210-dfc4-412b-b8b5-a5c56ffeb536
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1e332587fd39","subject":"Error contract","message":"Hi"}

--- response: 201 in 26 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-26e08210-dfc4-412b-b8b5-a5c56ffeb536
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
Location: /v1/conversations/cnv_cce9c89e-03c4-40a3-a299-855b8ab9f9e4
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_cce9c89e-03c4-40a3-a299-855b8ab9f9e4","subject":"Error contract","status":"open","region":"eu","participants":["qa-53dc78cb8727","qa-1e332587fd39"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-03T09:41:32.429994095Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-bc84b55d-7bbe-4da9-8b3d-00a09103fbdc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc84b55d-7bbe-4da9-8b3d-00a09103fbdc
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 16 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bc84b55d-7bbe-4da9-8b3d-00a09103fbdc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 473
RateLimit-Reset: 9
Content-Length: 252

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts","correlationId":"qa-bc84b55d-7bbe-4da9-8b3d-00a09103fbdc"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-1abab40e-cdb6-4465-861a-0cb7b49ec784

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1abab40e-cdb6-4465-861a-0cb7b49ec784
Content-Type: application/json

--- request body ---
{"handle":"qa-1e332587fd39","password":"****"}

--- response: 200 in 29 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-1abab40e-cdb6-4465-861a-0cb7b49ec784
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e683a588-2ff3-4330-84f2-da0a979976f8"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c5889aae-fa20-4de3-afec-d98c55b8f3d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5889aae-fa20-4de3-afec-d98c55b8f3d4
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c5889aae-fa20-4de3-afec-d98c55b8f3d4
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
correlation: qa-32909bb4-f096-47f8-aac3-ccdc437e9223

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32909bb4-f096-47f8-aac3-ccdc437e9223
Content-Type: application/json

--- request body ---
{"handle":"qa-1e332587fd39","password":"****"}

--- response: 401 in 14 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-32909bb4-f096-47f8-aac3-ccdc437e9223
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 458
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-32909bb4-f096-47f8-aac3-ccdc437e9223"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-087ce420-5479-4aa4-94f2-69bb3b586756

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-087ce420-5479-4aa4-94f2-69bb3b586756
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-087ce420-5479-4aa4-94f2-69bb3b586756
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
correlation: qa-cffd8ae8-7215-43d4-8020-ec907548c459

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cffd8ae8-7215-43d4-8020-ec907548c459
Content-Type: application/json

--- request body ---
{"handle":"qa-53dc78cb8727","password":"****"}

--- response: 401 in 15 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cffd8ae8-7215-43d4-8020-ec907548c459
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 451
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cffd8ae8-7215-43d4-8020-ec907548c459"}
```
