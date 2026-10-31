# Transcript: Every conversation operation answers an unknown id with a 404 problem [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[1]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-4d6a3977-d357-4794-ad58-4b7a18a2d917` |
| 2 | `POST /v1/auth/token` | 200 | 8 | `qa-efaa1dc3-8815-4f0e-a825-300189f1d7c4` |
| 3 | `GET /v1/conversations/{id}/messages` | 404 | 7 | `qa-68822de2-92b5-45e9-8119-a940862c3d36` |
| 4 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-78f1018d-79c1-4283-a19d-333ebe52293d` |
| 5 | `POST /v1/auth/token` | 401 | 10 | `qa-8e27fb00-c9d3-43a5-93b2-3878a5bb0f87` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4d6a3977-d357-4794-ad58-4b7a18a2d917

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d6a3977-d357-4794-ad58-4b7a18a2d917
Content-Type: application/json

--- request body ---
{"handle":"qa-1b618ac92390","displayName":"QA 1b618ac92390","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-4d6a3977-d357-4794-ad58-4b7a18a2d917
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 287
RateLimit-Reset: 8
Location: /v1/accounts/qa-1b618ac92390
X-Served-Region: eu
Content-Length: 181

{"id":"acc_51511719-62b1-4dc7-9f86-ccfa96a876cc","handle":"qa-1b618ac92390","displayName":"QA 1b618ac92390","region":"eu","role":"user","createdAt":"2026-10-28T08:42:53.610515760Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-efaa1dc3-8815-4f0e-a825-300189f1d7c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-efaa1dc3-8815-4f0e-a825-300189f1d7c4
Content-Type: application/json

--- request body ---
{"handle":"qa-1b618ac92390","password":"****"}

--- response: 200 in 8 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-efaa1dc3-8815-4f0e-a825-300189f1d7c4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 284
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_51511719-62b1-4dc7-9f86-ccfa96a876cc"}
```

## 3. GET /v1/conversations/{id}/messages

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-68822de2-92b5-45e9-8119-a940862c3d36

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68822de2-92b5-45e9-8119-a940862c3d36
Content-Type: application/json

--- response: 404 in 7 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-68822de2-92b5-45e9-8119-a940862c3d36
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-68822de2-92b5-45e9-8119-a940862c3d36"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-78f1018d-79c1-4283-a19d-333ebe52293d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78f1018d-79c1-4283-a19d-333ebe52293d
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-78f1018d-79c1-4283-a19d-333ebe52293d
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
correlation: qa-8e27fb00-c9d3-43a5-93b2-3878a5bb0f87

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e27fb00-c9d3-43a5-93b2-3878a5bb0f87
Content-Type: application/json

--- request body ---
{"handle":"qa-1b618ac92390","password":"****"}

--- response: 401 in 10 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8e27fb00-c9d3-43a5-93b2-3878a5bb0f87
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 280
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8e27fb00-c9d3-43a5-93b2-3878a5bb0f87"}
```
