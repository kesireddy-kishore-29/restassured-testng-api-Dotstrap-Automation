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
| 1 | `POST /v1/accounts` | 201 | 37 | `qa-3c4b1c41-334e-4dca-bcb2-c84a16145f71` |
| 2 | `POST /v1/auth/token` | 200 | 26 | `qa-bdf36798-8e39-412d-8809-042b9a41ea9d` |
| 3 | `GET /v1/conversations/{id}/messages` | 404 | 20 | `qa-ad88578b-0c83-45ae-b0a8-3283de8d7587` |
| 4 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-8ead4659-5d8d-4b2f-be37-3387774c72a8` |
| 5 | `POST /v1/auth/token` | 401 | 10 | `qa-d94b994f-2b18-43e8-af8a-e14f4cdb6270` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3c4b1c41-334e-4dca-bcb2-c84a16145f71

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c4b1c41-334e-4dca-bcb2-c84a16145f71
Content-Type: application/json

--- request body ---
{"handle":"qa-c9369cadb4b8","displayName":"QA c9369cadb4b8","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-3c4b1c41-334e-4dca-bcb2-c84a16145f71
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 291
RateLimit-Reset: 5
Location: /v1/accounts/qa-c9369cadb4b8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8ecfa83a-d1ec-438e-895d-7345d2f85fc6","handle":"qa-c9369cadb4b8","displayName":"QA c9369cadb4b8","region":"eu","role":"user","createdAt":"2026-11-19T10:29:27.885084664Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-bdf36798-8e39-412d-8809-042b9a41ea9d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bdf36798-8e39-412d-8809-042b9a41ea9d
Content-Type: application/json

--- request body ---
{"handle":"qa-c9369cadb4b8","password":"****"}

--- response: 200 in 26 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-bdf36798-8e39-412d-8809-042b9a41ea9d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 285
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8ecfa83a-d1ec-438e-895d-7345d2f85fc6"}
```

## 3. GET /v1/conversations/{id}/messages

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-ad88578b-0c83-45ae-b0a8-3283de8d7587

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad88578b-0c83-45ae-b0a8-3283de8d7587
Content-Type: application/json

--- response: 404 in 20 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ad88578b-0c83-45ae-b0a8-3283de8d7587
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-ad88578b-0c83-45ae-b0a8-3283de8d7587"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8ead4659-5d8d-4b2f-be37-3387774c72a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ead4659-5d8d-4b2f-be37-3387774c72a8
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Thu, 19 Nov 2026 10:29:28 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8ead4659-5d8d-4b2f-be37-3387774c72a8
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
correlation: qa-d94b994f-2b18-43e8-af8a-e14f4cdb6270

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d94b994f-2b18-43e8-af8a-e14f4cdb6270
Content-Type: application/json

--- request body ---
{"handle":"qa-c9369cadb4b8","password":"****"}

--- response: 401 in 10 ms ---
Date: Thu, 19 Nov 2026 10:29:28 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d94b994f-2b18-43e8-af8a-e14f4cdb6270
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 278
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d94b994f-2b18-43e8-af8a-e14f4cdb6270"}
```
