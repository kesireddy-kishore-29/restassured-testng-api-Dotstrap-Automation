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
| 1 | `POST /v1/accounts` | 201 | 42 | `qa-56e8dbba-346f-43cd-bc2a-e45a9307c5c4` |
| 2 | `POST /v1/auth/token` | 200 | 42 | `qa-7799ceb2-a4e6-40a2-aa64-4aae405e0710` |
| 3 | `GET /v1/conversations/{id}` | 404 | 13 | `qa-a032e355-fc43-4dfe-bf97-0e892a02fb0d` |
| 4 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-8ea69302-791a-42b8-be90-5f8557f29d18` |
| 5 | `POST /v1/auth/token` | 401 | 23 | `qa-c0877317-e56a-4dd1-8df4-b31541de14f4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-56e8dbba-346f-43cd-bc2a-e45a9307c5c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-56e8dbba-346f-43cd-bc2a-e45a9307c5c4
Content-Type: application/json

--- request body ---
{"handle":"qa-579c3c3aa7a0","displayName":"QA 579c3c3aa7a0","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-56e8dbba-346f-43cd-bc2a-e45a9307c5c4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 290
RateLimit-Reset: 5
Location: /v1/accounts/qa-579c3c3aa7a0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b71322ce-2e7d-448b-b76c-18ca9ce2515c","handle":"qa-579c3c3aa7a0","displayName":"QA 579c3c3aa7a0","region":"eu","role":"user","createdAt":"2026-11-19T10:29:27.895222088Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-7799ceb2-a4e6-40a2-aa64-4aae405e0710

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7799ceb2-a4e6-40a2-aa64-4aae405e0710
Content-Type: application/json

--- request body ---
{"handle":"qa-579c3c3aa7a0","password":"****"}

--- response: 200 in 42 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-7799ceb2-a4e6-40a2-aa64-4aae405e0710
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 282
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b71322ce-2e7d-448b-b76c-18ca9ce2515c"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-a032e355-fc43-4dfe-bf97-0e892a02fb0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a032e355-fc43-4dfe-bf97-0e892a02fb0d
Content-Type: application/json

--- response: 404 in 13 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a032e355-fc43-4dfe-bf97-0e892a02fb0d
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-a032e355-fc43-4dfe-bf97-0e892a02fb0d"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8ea69302-791a-42b8-be90-5f8557f29d18

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ea69302-791a-42b8-be90-5f8557f29d18
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Thu, 19 Nov 2026 10:29:28 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8ea69302-791a-42b8-be90-5f8557f29d18
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
correlation: qa-c0877317-e56a-4dd1-8df4-b31541de14f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0877317-e56a-4dd1-8df4-b31541de14f4
Content-Type: application/json

--- request body ---
{"handle":"qa-579c3c3aa7a0","password":"****"}

--- response: 401 in 23 ms ---
Date: Thu, 19 Nov 2026 10:29:28 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c0877317-e56a-4dd1-8df4-b31541de14f4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 280
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c0877317-e56a-4dd1-8df4-b31541de14f4"}
```
