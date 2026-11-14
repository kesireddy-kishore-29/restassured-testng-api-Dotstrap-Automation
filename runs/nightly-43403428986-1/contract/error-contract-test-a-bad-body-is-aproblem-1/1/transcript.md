# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[1]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 40 | `qa-aa8db2f5-90c3-43be-a83d-246370f8f29e` |
| 2 | `POST /v1/accounts` | 201 | 34 | `qa-b19fb96b-5776-44bd-97b7-98d8b476fee6` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-e1fde97b-8254-44c4-bffa-398116e7427c` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-c8504f07-e5c2-4c65-9783-4cd02544ae65` |
| 5 | `POST /v1/auth/token` | 415 | 50 | `qa-9db09f52-f373-4949-b53d-5106c90efdb0` |
| 6 | `POST /v1/auth/token` | 200 | 40 | `qa-40f5deed-494b-4049-8133-41594f501445` |
| 7 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-dc149191-6e7b-47b4-b15c-67d7dcc62d35` |
| 8 | `POST /v1/auth/token` | 401 | 40 | `qa-8676309d-4260-4735-83cb-8cc4893e23f2` |
| 9 | `DELETE /v1/accounts/me` | 204 | 46 | `qa-82151750-177a-4472-9b95-644b5ca3b615` |
| 10 | `POST /v1/auth/token` | 401 | 32 | `qa-44780b81-5095-45e9-b606-41f690d008e0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-aa8db2f5-90c3-43be-a83d-246370f8f29e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa8db2f5-90c3-43be-a83d-246370f8f29e
Content-Type: application/json

--- request body ---
{"handle":"qa-0e3587089afa","displayName":"QA 0e3587089afa","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-aa8db2f5-90c3-43be-a83d-246370f8f29e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 10
Location: /v1/accounts/qa-0e3587089afa
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e25ca43c-158a-45af-96ea-d7ec053b9f5b","handle":"qa-0e3587089afa","displayName":"QA 0e3587089afa","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.579862375Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b19fb96b-5776-44bd-97b7-98d8b476fee6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b19fb96b-5776-44bd-97b7-98d8b476fee6
Content-Type: application/json

--- request body ---
{"handle":"qa-ab213b459260","displayName":"QA ab213b459260","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-b19fb96b-5776-44bd-97b7-98d8b476fee6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 10
Location: /v1/accounts/qa-ab213b459260
X-Served-Region: eu
Content-Length: 181

{"id":"acc_896b1c21-4f34-4e03-b2ea-7f44dab0c504","handle":"qa-ab213b459260","displayName":"QA ab213b459260","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.633835908Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e1fde97b-8254-44c4-bffa-398116e7427c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1fde97b-8254-44c4-bffa-398116e7427c
Content-Type: application/json

--- request body ---
{"handle":"qa-0e3587089afa","password":"****"}

--- response: 200 in 26 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-e1fde97b-8254-44c4-bffa-398116e7427c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 558
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e25ca43c-158a-45af-96ea-d7ec053b9f5b"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c8504f07-e5c2-4c65-9783-4cd02544ae65

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8504f07-e5c2-4c65-9783-4cd02544ae65
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ab213b459260","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-c8504f07-e5c2-4c65-9783-4cd02544ae65
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
Location: /v1/conversations/cnv_bc18f3c6-90b1-4cdd-8312-6507395d56f1
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_bc18f3c6-90b1-4cdd-8312-6507395d56f1","subject":"Error contract","status":"open","region":"eu","participants":["qa-0e3587089afa","qa-ab213b459260"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-13T09:42:05.708562545Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-9db09f52-f373-4949-b53d-5106c90efdb0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9db09f52-f373-4949-b53d-5106c90efdb0
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 50 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9db09f52-f373-4949-b53d-5106c90efdb0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 547
RateLimit-Reset: 9
Content-Length: 254

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/auth/token","correlationId":"qa-9db09f52-f373-4949-b53d-5106c90efdb0"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-40f5deed-494b-4049-8133-41594f501445

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40f5deed-494b-4049-8133-41594f501445
Content-Type: application/json

--- request body ---
{"handle":"qa-ab213b459260","password":"****"}

--- response: 200 in 40 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-40f5deed-494b-4049-8133-41594f501445
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 518
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_896b1c21-4f34-4e03-b2ea-7f44dab0c504"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dc149191-6e7b-47b4-b15c-67d7dcc62d35

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc149191-6e7b-47b4-b15c-67d7dcc62d35
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dc149191-6e7b-47b4-b15c-67d7dcc62d35
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
correlation: qa-8676309d-4260-4735-83cb-8cc4893e23f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8676309d-4260-4735-83cb-8cc4893e23f2
Content-Type: application/json

--- request body ---
{"handle":"qa-ab213b459260","password":"****"}

--- response: 401 in 40 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8676309d-4260-4735-83cb-8cc4893e23f2
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8676309d-4260-4735-83cb-8cc4893e23f2"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-82151750-177a-4472-9b95-644b5ca3b615

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82151750-177a-4472-9b95-644b5ca3b615
Content-Type: application/json

--- response: 204 in 46 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-82151750-177a-4472-9b95-644b5ca3b615
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-44780b81-5095-45e9-b606-41f690d008e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44780b81-5095-45e9-b606-41f690d008e0
Content-Type: application/json

--- request body ---
{"handle":"qa-0e3587089afa","password":"****"}

--- response: 401 in 32 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-44780b81-5095-45e9-b606-41f690d008e0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 482
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-44780b81-5095-45e9-b606-41f690d008e0"}
```
