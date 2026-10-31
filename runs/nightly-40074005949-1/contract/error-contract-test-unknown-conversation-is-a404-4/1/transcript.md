# Transcript: Every conversation operation answers an unknown id with a 404 problem [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[4]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 6 | `qa-74abde7f-84d3-4f1f-afe5-27d6a34c28e8` |
| 2 | `POST /v1/auth/token` | 200 | 7 | `qa-c77b4c9e-3385-468b-9181-77393a5e6828` |
| 3 | `POST /v1/conversations/{id}/close` | 404 | 4 | `qa-0ed52af0-e2e8-4052-8f38-014be9213a56` |
| 4 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-5cc8338a-ed7b-4569-8862-8edacee7a21d` |
| 5 | `POST /v1/auth/token` | 401 | 4 | `qa-1f39f19b-52c4-482a-b791-604098de5c87` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-74abde7f-84d3-4f1f-afe5-27d6a34c28e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74abde7f-84d3-4f1f-afe5-27d6a34c28e8
Content-Type: application/json

--- request body ---
{"handle":"qa-8f37467405f6","displayName":"QA 8f37467405f6","password":"****","region":"eu"}

--- response: 201 in 6 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-74abde7f-84d3-4f1f-afe5-27d6a34c28e8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 274
RateLimit-Reset: 7
Location: /v1/accounts/qa-8f37467405f6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b046fdbc-53be-4e5f-b79d-358260b55501","handle":"qa-8f37467405f6","displayName":"QA 8f37467405f6","region":"eu","role":"user","createdAt":"2026-10-24T07:25:04.392261492Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-c77b4c9e-3385-468b-9181-77393a5e6828

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c77b4c9e-3385-468b-9181-77393a5e6828
Content-Type: application/json

--- request body ---
{"handle":"qa-8f37467405f6","password":"****"}

--- response: 200 in 7 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-c77b4c9e-3385-468b-9181-77393a5e6828
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 273
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b046fdbc-53be-4e5f-b79d-358260b55501"}
```

## 3. POST /v1/conversations/{id}/close

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/close
correlation: qa-0ed52af0-e2e8-4052-8f38-014be9213a56

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ed52af0-e2e8-4052-8f38-014be9213a56
Content-Type: application/json

--- response: 404 in 4 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0ed52af0-e2e8-4052-8f38-014be9213a56
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
Content-Length: 259

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/close","correlationId":"qa-0ed52af0-e2e8-4052-8f38-014be9213a56"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5cc8338a-ed7b-4569-8862-8edacee7a21d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5cc8338a-ed7b-4569-8862-8edacee7a21d
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5cc8338a-ed7b-4569-8862-8edacee7a21d
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
correlation: qa-1f39f19b-52c4-482a-b791-604098de5c87

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f39f19b-52c4-482a-b791-604098de5c87
Content-Type: application/json

--- request body ---
{"handle":"qa-8f37467405f6","password":"****"}

--- response: 401 in 4 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1f39f19b-52c4-482a-b791-604098de5c87
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 271
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1f39f19b-52c4-482a-b791-604098de5c87"}
```
