# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[17]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 30 | `qa-a7596d2d-50fd-4a66-9f78-dd4e3a5c1a04` |
| 2 | `POST /v1/accounts` | 201 | 10 | `qa-33472f04-c509-406a-b72f-030751817c31` |
| 3 | `POST /v1/auth/token` | 200 | 23 | `qa-a01e787f-0d3a-4b9b-80a2-3d92ba306239` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-c6733036-5ee8-43c3-a665-ed126f520630` |
| 5 | `POST /v1/credits/purchases` | 422 | 11 | `qa-1331fef9-35b6-4317-808d-71242e8cba18` |
| 6 | `POST /v1/auth/token` | 200 | 12 | `qa-add253ce-3b35-4d23-ba1a-6a3516237ace` |
| 7 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-decd5634-8b29-4dae-9d42-d3f39b457681` |
| 8 | `POST /v1/auth/token` | 401 | 8 | `qa-01e974d9-902c-4dd7-b8ea-e9c1b9ef15a3` |
| 9 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-9c6ad4f5-5b39-4e88-95c4-ba9b5921c705` |
| 10 | `POST /v1/auth/token` | 401 | 6 | `qa-c0210f8f-a905-40ba-923b-10c65613b041` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a7596d2d-50fd-4a66-9f78-dd4e3a5c1a04

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7596d2d-50fd-4a66-9f78-dd4e3a5c1a04
Content-Type: application/json

--- request body ---
{"handle":"qa-833f43f6f57d","displayName":"QA 833f43f6f57d","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-a7596d2d-50fd-4a66-9f78-dd4e3a5c1a04
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 319
RateLimit-Reset: 7
Location: /v1/accounts/qa-833f43f6f57d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e4a73878-7f39-42c6-9dba-b830abe33a40","handle":"qa-833f43f6f57d","displayName":"QA 833f43f6f57d","region":"eu","role":"user","createdAt":"2026-11-07T08:54:59.575089221Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-33472f04-c509-406a-b72f-030751817c31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33472f04-c509-406a-b72f-030751817c31
Content-Type: application/json

--- request body ---
{"handle":"qa-ea93f7080775","displayName":"QA ea93f7080775","password":"****","region":"eu"}

--- response: 201 in 10 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-33472f04-c509-406a-b72f-030751817c31
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 317
RateLimit-Reset: 7
Location: /v1/accounts/qa-ea93f7080775
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7c0db7d3-1da4-4d8a-a6b9-e8e81e8e6433","handle":"qa-ea93f7080775","displayName":"QA ea93f7080775","region":"eu","role":"user","createdAt":"2026-11-07T08:54:59.597890559Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a01e787f-0d3a-4b9b-80a2-3d92ba306239

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a01e787f-0d3a-4b9b-80a2-3d92ba306239
Content-Type: application/json

--- request body ---
{"handle":"qa-833f43f6f57d","password":"****"}

--- response: 200 in 23 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-a01e787f-0d3a-4b9b-80a2-3d92ba306239
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 313
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e4a73878-7f39-42c6-9dba-b830abe33a40"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c6733036-5ee8-43c3-a665-ed126f520630

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6733036-5ee8-43c3-a665-ed126f520630
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ea93f7080775","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-c6733036-5ee8-43c3-a665-ed126f520630
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
Location: /v1/conversations/cnv_8fad4422-a36f-443a-b153-bc4f4b833583
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_8fad4422-a36f-443a-b153-bc4f4b833583","subject":"Error contract","status":"open","region":"eu","participants":["qa-833f43f6f57d","qa-ea93f7080775"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-07T08:54:59.642073405Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-1331fef9-35b6-4317-808d-71242e8cba18

--- request headers ---
Accept: application/json
Idempotency-Key: qa-2267560fafef4af5bd6e6a654aadb949
X-Correlation-Id: qa-1331fef9-35b6-4317-808d-71242e8cba18
Content-Type: application/json

--- request body ---
{"packId":"pack-0"}

--- response: 422 in 11 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1331fef9-35b6-4317-808d-71242e8cba18
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-1331fef9-35b6-4317-808d-71242e8cba18","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-add253ce-3b35-4d23-ba1a-6a3516237ace

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-add253ce-3b35-4d23-ba1a-6a3516237ace
Content-Type: application/json

--- request body ---
{"handle":"qa-ea93f7080775","password":"****"}

--- response: 200 in 12 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-add253ce-3b35-4d23-ba1a-6a3516237ace
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 296
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7c0db7d3-1da4-4d8a-a6b9-e8e81e8e6433"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-decd5634-8b29-4dae-9d42-d3f39b457681

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-decd5634-8b29-4dae-9d42-d3f39b457681
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-decd5634-8b29-4dae-9d42-d3f39b457681
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
correlation: qa-01e974d9-902c-4dd7-b8ea-e9c1b9ef15a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01e974d9-902c-4dd7-b8ea-e9c1b9ef15a3
Content-Type: application/json

--- request body ---
{"handle":"qa-ea93f7080775","password":"****"}

--- response: 401 in 8 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-01e974d9-902c-4dd7-b8ea-e9c1b9ef15a3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 293
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-01e974d9-902c-4dd7-b8ea-e9c1b9ef15a3"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9c6ad4f5-5b39-4e88-95c4-ba9b5921c705

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c6ad4f5-5b39-4e88-95c4-ba9b5921c705
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9c6ad4f5-5b39-4e88-95c4-ba9b5921c705
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
correlation: qa-c0210f8f-a905-40ba-923b-10c65613b041

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0210f8f-a905-40ba-923b-10c65613b041
Content-Type: application/json

--- request body ---
{"handle":"qa-833f43f6f57d","password":"****"}

--- response: 401 in 6 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c0210f8f-a905-40ba-923b-10c65613b041
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 291
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c0210f8f-a905-40ba-923b-10c65613b041"}
```
