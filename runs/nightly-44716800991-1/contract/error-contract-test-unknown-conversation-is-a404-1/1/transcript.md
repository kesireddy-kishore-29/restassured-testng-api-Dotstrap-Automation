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
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-0b9729d2-45e6-442b-a1d6-50939acbd10d` |
| 2 | `POST /v1/auth/token` | 200 | 19 | `qa-60837f49-06c2-47fd-85a5-1a0ee60af4c2` |
| 3 | `GET /v1/conversations/{id}/messages` | 404 | 12 | `qa-6b9ca6ad-16aa-46d4-bc66-185aa54c345f` |
| 4 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-66903720-fb46-42d1-85fd-b81d01fb9897` |
| 5 | `POST /v1/auth/token` | 401 | 15 | `qa-9191cdd4-36cd-4077-b091-43f6a28f8f87` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0b9729d2-45e6-442b-a1d6-50939acbd10d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b9729d2-45e6-442b-a1d6-50939acbd10d
Content-Type: application/json

--- request body ---
{"handle":"qa-1f581c44e914","displayName":"QA 1f581c44e914","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-0b9729d2-45e6-442b-a1d6-50939acbd10d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 289
RateLimit-Reset: 6
Location: /v1/accounts/qa-1f581c44e914
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cf87d73e-f199-4535-99ba-92130b7fcdfa","handle":"qa-1f581c44e914","displayName":"QA 1f581c44e914","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.175692541Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-60837f49-06c2-47fd-85a5-1a0ee60af4c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60837f49-06c2-47fd-85a5-1a0ee60af4c2
Content-Type: application/json

--- request body ---
{"handle":"qa-1f581c44e914","password":"****"}

--- response: 200 in 19 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-60837f49-06c2-47fd-85a5-1a0ee60af4c2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 284
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cf87d73e-f199-4535-99ba-92130b7fcdfa"}
```

## 3. GET /v1/conversations/{id}/messages

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-6b9ca6ad-16aa-46d4-bc66-185aa54c345f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b9ca6ad-16aa-46d4-bc66-185aa54c345f
Content-Type: application/json

--- response: 404 in 12 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6b9ca6ad-16aa-46d4-bc66-185aa54c345f
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-6b9ca6ad-16aa-46d4-bc66-185aa54c345f"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-66903720-fb46-42d1-85fd-b81d01fb9897

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66903720-fb46-42d1-85fd-b81d01fb9897
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-66903720-fb46-42d1-85fd-b81d01fb9897
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
correlation: qa-9191cdd4-36cd-4077-b091-43f6a28f8f87

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9191cdd4-36cd-4077-b091-43f6a28f8f87
Content-Type: application/json

--- request body ---
{"handle":"qa-1f581c44e914","password":"****"}

--- response: 401 in 15 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9191cdd4-36cd-4077-b091-43f6a28f8f87
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9191cdd4-36cd-4077-b091-43f6a28f8f87"}
```
