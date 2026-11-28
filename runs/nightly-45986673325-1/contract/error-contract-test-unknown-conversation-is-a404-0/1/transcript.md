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
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-c366c614-5227-41f9-8668-af7019a44c80` |
| 2 | `POST /v1/auth/token` | 200 | 36 | `qa-5a0c7a84-1e48-4b2c-a7d0-19754eacf91d` |
| 3 | `GET /v1/conversations/{id}` | 404 | 15 | `qa-9cd2fde8-d9a9-428e-a04c-c543d94405e8` |
| 4 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-5135bb78-9e17-4c5f-91c3-de3fe5aca3ec` |
| 5 | `POST /v1/auth/token` | 401 | 15 | `qa-c0fff800-1824-416e-9a90-86560d75c13f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c366c614-5227-41f9-8668-af7019a44c80

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c366c614-5227-41f9-8668-af7019a44c80
Content-Type: application/json

--- request body ---
{"handle":"qa-03fc59390653","displayName":"QA 03fc59390653","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-c366c614-5227-41f9-8668-af7019a44c80
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
Location: /v1/accounts/qa-03fc59390653
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5baf06e5-4605-403d-b0f9-6808945f3c0c","handle":"qa-03fc59390653","displayName":"QA 03fc59390653","region":"eu","role":"user","createdAt":"2026-11-27T11:00:00.578219990Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-5a0c7a84-1e48-4b2c-a7d0-19754eacf91d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a0c7a84-1e48-4b2c-a7d0-19754eacf91d
Content-Type: application/json

--- request body ---
{"handle":"qa-03fc59390653","password":"****"}

--- response: 200 in 36 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-5a0c7a84-1e48-4b2c-a7d0-19754eacf91d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 283
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5baf06e5-4605-403d-b0f9-6808945f3c0c"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-9cd2fde8-d9a9-428e-a04c-c543d94405e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9cd2fde8-d9a9-428e-a04c-c543d94405e8
Content-Type: application/json

--- response: 404 in 15 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9cd2fde8-d9a9-428e-a04c-c543d94405e8
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-9cd2fde8-d9a9-428e-a04c-c543d94405e8"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5135bb78-9e17-4c5f-91c3-de3fe5aca3ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5135bb78-9e17-4c5f-91c3-de3fe5aca3ec
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5135bb78-9e17-4c5f-91c3-de3fe5aca3ec
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
correlation: qa-c0fff800-1824-416e-9a90-86560d75c13f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0fff800-1824-416e-9a90-86560d75c13f
Content-Type: application/json

--- request body ---
{"handle":"qa-03fc59390653","password":"****"}

--- response: 401 in 15 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c0fff800-1824-416e-9a90-86560d75c13f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 273
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c0fff800-1824-416e-9a90-86560d75c13f"}
```
