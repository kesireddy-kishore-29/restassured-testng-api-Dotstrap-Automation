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
| 1 | `POST /v1/accounts` | 201 | 15 | `qa-1d8c460e-ecef-4c56-b3a5-5debba16ca8c` |
| 2 | `POST /v1/accounts` | 201 | 16 | `qa-f2274015-bf5d-46a3-b301-a7ad1604a2d8` |
| 3 | `POST /v1/auth/token` | 200 | 31 | `qa-51ff5da3-9c3c-4faa-a3bf-229d3ed549de` |
| 4 | `POST /v1/conversations` | 201 | 28 | `qa-09103235-0749-4ce3-ab9a-12b2a00c9749` |
| 5 | `GET /v1/credits/balance` | 503 | 22 | `qa-2ddd3eea-c8b1-4b5f-8248-be68a867fe42` |
| 6 | `POST /v1/auth/token` | 200 | 15 | `qa-578bb578-b185-45c6-b42c-c3dc8a890c09` |
| 7 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-f1f2375e-7c0c-4a56-bb26-68cbca71e608` |
| 8 | `POST /v1/auth/token` | 401 | 19 | `qa-bedf90b1-fec3-482c-a666-0e412a91e307` |
| 9 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-4f0e96c9-e4a4-476e-8c1e-18d9a4735c14` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-ee2272bf-f303-47ae-9700-a5f1c1f3537e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1d8c460e-ecef-4c56-b3a5-5debba16ca8c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d8c460e-ecef-4c56-b3a5-5debba16ca8c
Content-Type: application/json

--- request body ---
{"handle":"qa-d970e9476827","displayName":"QA d970e9476827","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-1d8c460e-ecef-4c56-b3a5-5debba16ca8c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 360
RateLimit-Reset: 8
Location: /v1/accounts/qa-d970e9476827
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f940340b-19f7-4ba1-bc83-b4a4d3644671","handle":"qa-d970e9476827","displayName":"QA d970e9476827","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.636305325Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f2274015-bf5d-46a3-b301-a7ad1604a2d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2274015-bf5d-46a3-b301-a7ad1604a2d8
Content-Type: application/json

--- request body ---
{"handle":"qa-3c731d33c18d","displayName":"QA 3c731d33c18d","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-f2274015-bf5d-46a3-b301-a7ad1604a2d8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 357
RateLimit-Reset: 8
Location: /v1/accounts/qa-3c731d33c18d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_20eadd16-b364-43f2-a646-2ed9ea89e500","handle":"qa-3c731d33c18d","displayName":"QA 3c731d33c18d","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.653082258Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-51ff5da3-9c3c-4faa-a3bf-229d3ed549de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51ff5da3-9c3c-4faa-a3bf-229d3ed549de
Content-Type: application/json

--- request body ---
{"handle":"qa-d970e9476827","password":"****"}

--- response: 200 in 31 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-51ff5da3-9c3c-4faa-a3bf-229d3ed549de
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 351
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f940340b-19f7-4ba1-bc83-b4a4d3644671"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-09103235-0749-4ce3-ab9a-12b2a00c9749

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09103235-0749-4ce3-ab9a-12b2a00c9749
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3c731d33c18d","subject":"Error contract","message":"Hi"}

--- response: 201 in 28 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-09103235-0749-4ce3-ab9a-12b2a00c9749
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
Location: /v1/conversations/cnv_fc47c04b-6940-4203-a413-7484f5762f03
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_fc47c04b-6940-4203-a413-7484f5762f03","subject":"Error contract","status":"open","region":"eu","participants":["qa-d970e9476827","qa-3c731d33c18d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-24T07:25:03.721907336Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-2ddd3eea-c8b1-4b5f-8248-be68a867fe42

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: e2727b4a-9951-478b-b8bd-a5aac2afd8fd
X-Correlation-Id: qa-2ddd3eea-c8b1-4b5f-8248-be68a867fe42
Content-Type: application/json

--- response: 503 in 22 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2ddd3eea-c8b1-4b5f-8248-be68a867fe42
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 263

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/balance","correlationId":"qa-2ddd3eea-c8b1-4b5f-8248-be68a867fe42"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-578bb578-b185-45c6-b42c-c3dc8a890c09

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-578bb578-b185-45c6-b42c-c3dc8a890c09
Content-Type: application/json

--- request body ---
{"handle":"qa-3c731d33c18d","password":"****"}

--- response: 200 in 15 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-578bb578-b185-45c6-b42c-c3dc8a890c09
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 337
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_20eadd16-b364-43f2-a646-2ed9ea89e500"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f1f2375e-7c0c-4a56-bb26-68cbca71e608

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1f2375e-7c0c-4a56-bb26-68cbca71e608
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f1f2375e-7c0c-4a56-bb26-68cbca71e608
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
correlation: qa-bedf90b1-fec3-482c-a666-0e412a91e307

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bedf90b1-fec3-482c-a666-0e412a91e307
Content-Type: application/json

--- request body ---
{"handle":"qa-3c731d33c18d","password":"****"}

--- response: 401 in 19 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bedf90b1-fec3-482c-a666-0e412a91e307
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 331
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bedf90b1-fec3-482c-a666-0e412a91e307"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4f0e96c9-e4a4-476e-8c1e-18d9a4735c14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f0e96c9-e4a4-476e-8c1e-18d9a4735c14
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4f0e96c9-e4a4-476e-8c1e-18d9a4735c14
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
correlation: qa-ee2272bf-f303-47ae-9700-a5f1c1f3537e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee2272bf-f303-47ae-9700-a5f1c1f3537e
Content-Type: application/json

--- request body ---
{"handle":"qa-d970e9476827","password":"****"}

--- response: 401 in 13 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ee2272bf-f303-47ae-9700-a5f1c1f3537e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 324
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ee2272bf-f303-47ae-9700-a5f1c1f3537e"}
```
