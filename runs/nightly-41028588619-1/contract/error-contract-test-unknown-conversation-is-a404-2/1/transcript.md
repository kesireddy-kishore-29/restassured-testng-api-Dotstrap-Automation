# Transcript: Every conversation operation answers an unknown id with a 404 problem [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[2]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 26 | `qa-b9751b30-5207-456a-ae89-270f213900be` |
| 2 | `POST /v1/auth/token` | 200 | 29 | `qa-bff9c3b0-5d75-46eb-9aef-98632063b68b` |
| 3 | `POST /v1/conversations/{id}/messages` | 404 | 34 | `qa-ed5d8d02-b5e1-46ea-b949-87fe061ad8c6` |
| 4 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-f37beaff-c69e-4795-97cb-aae62733f545` |
| 5 | `POST /v1/auth/token` | 401 | 6 | `qa-cce0c403-2e6f-4e1e-9831-45b2d21edf1e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b9751b30-5207-456a-ae89-270f213900be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9751b30-5207-456a-ae89-270f213900be
Content-Type: application/json

--- request body ---
{"handle":"qa-2c43fa824937","displayName":"QA 2c43fa824937","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9751b30-5207-456a-ae89-270f213900be
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 308
RateLimit-Reset: 6
Location: /v1/accounts/qa-2c43fa824937
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c1a4e868-a497-4c17-8aac-02a563870cf1","handle":"qa-2c43fa824937","displayName":"QA 2c43fa824937","region":"eu","role":"user","createdAt":"2026-10-30T08:46:06.123552991Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-bff9c3b0-5d75-46eb-9aef-98632063b68b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bff9c3b0-5d75-46eb-9aef-98632063b68b
Content-Type: application/json

--- request body ---
{"handle":"qa-2c43fa824937","password":"****"}

--- response: 200 in 29 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-bff9c3b0-5d75-46eb-9aef-98632063b68b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 303
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c1a4e868-a497-4c17-8aac-02a563870cf1"}
```

## 3. POST /v1/conversations/{id}/messages

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-ed5d8d02-b5e1-46ea-b949-87fe061ad8c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed5d8d02-b5e1-46ea-b949-87fe061ad8c6
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 404 in 34 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ed5d8d02-b5e1-46ea-b949-87fe061ad8c6
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
Content-Length: 262

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-ed5d8d02-b5e1-46ea-b949-87fe061ad8c6"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f37beaff-c69e-4795-97cb-aae62733f545

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f37beaff-c69e-4795-97cb-aae62733f545
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f37beaff-c69e-4795-97cb-aae62733f545
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

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-cce0c403-2e6f-4e1e-9831-45b2d21edf1e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cce0c403-2e6f-4e1e-9831-45b2d21edf1e
Content-Type: application/json

--- request body ---
{"handle":"qa-2c43fa824937","password":"****"}

--- response: 401 in 6 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cce0c403-2e6f-4e1e-9831-45b2d21edf1e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 294
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cce0c403-2e6f-4e1e-9831-45b2d21edf1e"}
```
