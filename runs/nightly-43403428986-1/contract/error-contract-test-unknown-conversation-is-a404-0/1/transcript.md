# Transcript: Every conversation operation answers an unknown id with a 404 problem [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[0]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 32 | `qa-5294a812-bb49-4557-a8b1-42b4739747ad` |
| 2 | `POST /v1/auth/token` | 200 | 19 | `qa-d2f26bd9-6002-4baa-94ae-bc11d08fca08` |
| 3 | `GET /v1/conversations/{id}` | 404 | 7 | `qa-881f3d02-a559-42c0-af87-64e443c1b09c` |
| 4 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-cb3aea3c-4c8f-4854-91d9-a2017cfeba72` |
| 5 | `POST /v1/auth/token` | 401 | 4 | `qa-33a8d10d-6bca-474f-bb0a-6e0235f509c3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5294a812-bb49-4557-a8b1-42b4739747ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5294a812-bb49-4557-a8b1-42b4739747ad
Content-Type: application/json

--- request body ---
{"handle":"qa-11cfc4e3769b","displayName":"QA 11cfc4e3769b","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-5294a812-bb49-4557-a8b1-42b4739747ad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 292
RateLimit-Reset: 6
Location: /v1/accounts/qa-11cfc4e3769b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b110995c-2cdf-42a3-80b4-8cfaaaca3b27","handle":"qa-11cfc4e3769b","displayName":"QA 11cfc4e3769b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:08.814839366Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-d2f26bd9-6002-4baa-94ae-bc11d08fca08

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2f26bd9-6002-4baa-94ae-bc11d08fca08
Content-Type: application/json

--- request body ---
{"handle":"qa-11cfc4e3769b","password":"****"}

--- response: 200 in 19 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-d2f26bd9-6002-4baa-94ae-bc11d08fca08
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 287
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b110995c-2cdf-42a3-80b4-8cfaaaca3b27"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-881f3d02-a559-42c0-af87-64e443c1b09c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-881f3d02-a559-42c0-af87-64e443c1b09c
Content-Type: application/json

--- response: 404 in 7 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-881f3d02-a559-42c0-af87-64e443c1b09c
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
Content-Length: 253

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-881f3d02-a559-42c0-af87-64e443c1b09c"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cb3aea3c-4c8f-4854-91d9-a2017cfeba72

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb3aea3c-4c8f-4854-91d9-a2017cfeba72
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cb3aea3c-4c8f-4854-91d9-a2017cfeba72
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
correlation: qa-33a8d10d-6bca-474f-bb0a-6e0235f509c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33a8d10d-6bca-474f-bb0a-6e0235f509c3
Content-Type: application/json

--- request body ---
{"handle":"qa-11cfc4e3769b","password":"****"}

--- response: 401 in 4 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-33a8d10d-6bca-474f-bb0a-6e0235f509c3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 280
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-33a8d10d-6bca-474f-bb0a-6e0235f509c3"}
```
