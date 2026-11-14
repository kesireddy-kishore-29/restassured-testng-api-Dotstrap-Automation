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
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-db5f1068-2b19-440a-b75d-4ba5c7505402` |
| 2 | `POST /v1/auth/token` | 200 | 22 | `qa-4053ef0c-3f19-4693-81e9-e47cd0bf325b` |
| 3 | `POST /v1/conversations/{id}/messages` | 404 | 3 | `qa-f5cd7da9-10fa-4dc4-8028-785efd4f7f6d` |
| 4 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-709f2bc5-7d12-4ec2-8b53-d67ab4e1b010` |
| 5 | `POST /v1/auth/token` | 401 | 10 | `qa-0cb99ff2-977e-4283-83fa-4a3c9e857d02` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-db5f1068-2b19-440a-b75d-4ba5c7505402

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db5f1068-2b19-440a-b75d-4ba5c7505402
Content-Type: application/json

--- request body ---
{"handle":"qa-1884386c2236","displayName":"QA 1884386c2236","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-db5f1068-2b19-440a-b75d-4ba5c7505402
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 291
RateLimit-Reset: 6
Location: /v1/accounts/qa-1884386c2236
X-Served-Region: eu
Content-Length: 181

{"id":"acc_13fdfac9-d265-4c35-b832-f0b26ea8016a","handle":"qa-1884386c2236","displayName":"QA 1884386c2236","region":"eu","role":"user","createdAt":"2026-11-13T09:42:08.811312844Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-4053ef0c-3f19-4693-81e9-e47cd0bf325b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4053ef0c-3f19-4693-81e9-e47cd0bf325b
Content-Type: application/json

--- request body ---
{"handle":"qa-1884386c2236","password":"****"}

--- response: 200 in 22 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-4053ef0c-3f19-4693-81e9-e47cd0bf325b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 286
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_13fdfac9-d265-4c35-b832-f0b26ea8016a"}
```

## 3. POST /v1/conversations/{id}/messages

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-f5cd7da9-10fa-4dc4-8028-785efd4f7f6d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5cd7da9-10fa-4dc4-8028-785efd4f7f6d
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 404 in 3 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f5cd7da9-10fa-4dc4-8028-785efd4f7f6d
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-f5cd7da9-10fa-4dc4-8028-785efd4f7f6d"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-709f2bc5-7d12-4ec2-8b53-d67ab4e1b010

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-709f2bc5-7d12-4ec2-8b53-d67ab4e1b010
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: text/plain
X-Correlation-Id: qa-709f2bc5-7d12-4ec2-8b53-d67ab4e1b010
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
correlation: qa-0cb99ff2-977e-4283-83fa-4a3c9e857d02

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0cb99ff2-977e-4283-83fa-4a3c9e857d02
Content-Type: application/json

--- request body ---
{"handle":"qa-1884386c2236","password":"****"}

--- response: 401 in 10 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0cb99ff2-977e-4283-83fa-4a3c9e857d02
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 279
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0cb99ff2-977e-4283-83fa-4a3c9e857d02"}
```
