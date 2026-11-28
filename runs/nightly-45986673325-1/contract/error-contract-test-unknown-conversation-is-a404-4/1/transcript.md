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
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-c2400f2a-75ff-46c8-8715-94c251540085` |
| 2 | `POST /v1/auth/token` | 200 | 19 | `qa-907bb42f-afbd-4860-ba8e-608dab6e594f` |
| 3 | `POST /v1/conversations/{id}/close` | 404 | 14 | `qa-605cf37a-eba2-4cf8-88c6-63707044157d` |
| 4 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-1189938b-5bf5-4bbe-80c5-ba287eccb14c` |
| 5 | `POST /v1/auth/token` | 401 | 11 | `qa-a95d574e-f571-4019-9c9c-79c90db463b7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c2400f2a-75ff-46c8-8715-94c251540085

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c2400f2a-75ff-46c8-8715-94c251540085
Content-Type: application/json

--- request body ---
{"handle":"qa-596313376a2e","displayName":"QA 596313376a2e","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-c2400f2a-75ff-46c8-8715-94c251540085
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 277
RateLimit-Reset: 6
Location: /v1/accounts/qa-596313376a2e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4e4d48b7-2bee-4ec5-846a-6a0c11ebf0f3","handle":"qa-596313376a2e","displayName":"QA 596313376a2e","region":"eu","role":"user","createdAt":"2026-11-27T11:00:00.802323530Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-907bb42f-afbd-4860-ba8e-608dab6e594f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-907bb42f-afbd-4860-ba8e-608dab6e594f
Content-Type: application/json

--- request body ---
{"handle":"qa-596313376a2e","password":"****"}

--- response: 200 in 19 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-907bb42f-afbd-4860-ba8e-608dab6e594f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 276
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4e4d48b7-2bee-4ec5-846a-6a0c11ebf0f3"}
```

## 3. POST /v1/conversations/{id}/close

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/close
correlation: qa-605cf37a-eba2-4cf8-88c6-63707044157d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-605cf37a-eba2-4cf8-88c6-63707044157d
Content-Type: application/json

--- response: 404 in 14 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-605cf37a-eba2-4cf8-88c6-63707044157d
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/close","correlationId":"qa-605cf37a-eba2-4cf8-88c6-63707044157d"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1189938b-5bf5-4bbe-80c5-ba287eccb14c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1189938b-5bf5-4bbe-80c5-ba287eccb14c
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1189938b-5bf5-4bbe-80c5-ba287eccb14c
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
correlation: qa-a95d574e-f571-4019-9c9c-79c90db463b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a95d574e-f571-4019-9c9c-79c90db463b7
Content-Type: application/json

--- request body ---
{"handle":"qa-596313376a2e","password":"****"}

--- response: 401 in 11 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a95d574e-f571-4019-9c9c-79c90db463b7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 271
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a95d574e-f571-4019-9c9c-79c90db463b7"}
```
