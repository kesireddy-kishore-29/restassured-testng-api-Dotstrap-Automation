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
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-a308efdb-8282-467e-911a-4cd55387952f` |
| 2 | `POST /v1/auth/token` | 200 | 19 | `qa-86a946a0-9706-4f08-86e5-2c8e257203ca` |
| 3 | `POST /v1/conversations/{id}/close` | 404 | 6 | `qa-06b43417-aab8-4f20-a17b-4c801e6d3d17` |
| 4 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-6fce5d4f-888a-4b45-9eaa-f42dd50e6135` |
| 5 | `POST /v1/auth/token` | 401 | 13 | `qa-415d0496-972f-42d9-873c-a1e7da0f1ad2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a308efdb-8282-467e-911a-4cd55387952f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a308efdb-8282-467e-911a-4cd55387952f
Content-Type: application/json

--- request body ---
{"handle":"qa-719cd6cfa9b8","displayName":"QA 719cd6cfa9b8","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-a308efdb-8282-467e-911a-4cd55387952f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 276
RateLimit-Reset: 7
Location: /v1/accounts/qa-719cd6cfa9b8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e6282521-f4f0-45e4-bdac-a18fc7370f4e","handle":"qa-719cd6cfa9b8","displayName":"QA 719cd6cfa9b8","region":"eu","role":"user","createdAt":"2026-11-23T10:55:00.630096071Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-86a946a0-9706-4f08-86e5-2c8e257203ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86a946a0-9706-4f08-86e5-2c8e257203ca
Content-Type: application/json

--- request body ---
{"handle":"qa-719cd6cfa9b8","password":"****"}

--- response: 200 in 19 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-86a946a0-9706-4f08-86e5-2c8e257203ca
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e6282521-f4f0-45e4-bdac-a18fc7370f4e"}
```

## 3. POST /v1/conversations/{id}/close

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/close
correlation: qa-06b43417-aab8-4f20-a17b-4c801e6d3d17

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-06b43417-aab8-4f20-a17b-4c801e6d3d17
Content-Type: application/json

--- response: 404 in 6 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-06b43417-aab8-4f20-a17b-4c801e6d3d17
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/close","correlationId":"qa-06b43417-aab8-4f20-a17b-4c801e6d3d17"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6fce5d4f-888a-4b45-9eaa-f42dd50e6135

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6fce5d4f-888a-4b45-9eaa-f42dd50e6135
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6fce5d4f-888a-4b45-9eaa-f42dd50e6135
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
correlation: qa-415d0496-972f-42d9-873c-a1e7da0f1ad2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-415d0496-972f-42d9-873c-a1e7da0f1ad2
Content-Type: application/json

--- request body ---
{"handle":"qa-719cd6cfa9b8","password":"****"}

--- response: 401 in 13 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-415d0496-972f-42d9-873c-a1e7da0f1ad2
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-415d0496-972f-42d9-873c-a1e7da0f1ad2"}
```
