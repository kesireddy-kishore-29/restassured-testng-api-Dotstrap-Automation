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
| 1 | `POST /v1/accounts` | 201 | 18 | `qa-083a4bbc-7aba-403b-968a-4f8e3e6f763a` |
| 2 | `POST /v1/auth/token` | 200 | 23 | `qa-7113c70b-495d-41fb-8bff-2112961e5ab9` |
| 3 | `POST /v1/conversations/{id}/close` | 404 | 11 | `qa-b4c5bf87-b124-4141-8e43-9b9932bba068` |
| 4 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-d284e0af-dcd7-4002-904f-1d221e47bd66` |
| 5 | `POST /v1/auth/token` | 401 | 6 | `qa-02462a58-936a-4aba-8f3b-a1ca3a90ce48` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-083a4bbc-7aba-403b-968a-4f8e3e6f763a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-083a4bbc-7aba-403b-968a-4f8e3e6f763a
Content-Type: application/json

--- request body ---
{"handle":"qa-774994d58624","displayName":"QA 774994d58624","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-083a4bbc-7aba-403b-968a-4f8e3e6f763a
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
Location: /v1/accounts/qa-774994d58624
X-Served-Region: eu
Content-Length: 181

{"id":"acc_66f3bf00-e955-403f-8b4a-da09cb092db3","handle":"qa-774994d58624","displayName":"QA 774994d58624","region":"eu","role":"user","createdAt":"2026-11-11T09:34:39.661660854Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-7113c70b-495d-41fb-8bff-2112961e5ab9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7113c70b-495d-41fb-8bff-2112961e5ab9
Content-Type: application/json

--- request body ---
{"handle":"qa-774994d58624","password":"****"}

--- response: 200 in 23 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-7113c70b-495d-41fb-8bff-2112961e5ab9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 274
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_66f3bf00-e955-403f-8b4a-da09cb092db3"}
```

## 3. POST /v1/conversations/{id}/close

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/close
correlation: qa-b4c5bf87-b124-4141-8e43-9b9932bba068

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4c5bf87-b124-4141-8e43-9b9932bba068
Content-Type: application/json

--- response: 404 in 11 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b4c5bf87-b124-4141-8e43-9b9932bba068
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/close","correlationId":"qa-b4c5bf87-b124-4141-8e43-9b9932bba068"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d284e0af-dcd7-4002-904f-1d221e47bd66

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d284e0af-dcd7-4002-904f-1d221e47bd66
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d284e0af-dcd7-4002-904f-1d221e47bd66
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
correlation: qa-02462a58-936a-4aba-8f3b-a1ca3a90ce48

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02462a58-936a-4aba-8f3b-a1ca3a90ce48
Content-Type: application/json

--- request body ---
{"handle":"qa-774994d58624","password":"****"}

--- response: 401 in 6 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-02462a58-936a-4aba-8f3b-a1ca3a90ce48
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 271
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-02462a58-936a-4aba-8f3b-a1ca3a90ce48"}
```
