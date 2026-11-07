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
| 1 | `POST /v1/accounts` | 201 | 35 | `qa-18907463-eca4-4638-885d-2a1d11e43d8f` |
| 2 | `POST /v1/auth/token` | 200 | 16 | `qa-bfda34dd-93a3-48dd-89e5-5652b4ab540e` |
| 3 | `POST /v1/conversations/{id}/close` | 404 | 5 | `qa-711f7c86-e977-4e45-a57a-d830d13dbf60` |
| 4 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-0ad37703-aca8-4d37-ad6c-00ce21553ad8` |
| 5 | `POST /v1/auth/token` | 401 | 6 | `qa-5715a4ef-7695-4b77-a1cb-f4f77758c4f3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-18907463-eca4-4638-885d-2a1d11e43d8f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18907463-eca4-4638-885d-2a1d11e43d8f
Content-Type: application/json

--- request body ---
{"handle":"qa-9bc2dddd9fbe","displayName":"QA 9bc2dddd9fbe","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-18907463-eca4-4638-885d-2a1d11e43d8f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 274
RateLimit-Reset: 5
Location: /v1/accounts/qa-9bc2dddd9fbe
X-Served-Region: eu
Content-Length: 181

{"id":"acc_978c627b-0712-4b4d-b5f4-d0d90ee23320","handle":"qa-9bc2dddd9fbe","displayName":"QA 9bc2dddd9fbe","region":"eu","role":"user","createdAt":"2026-11-05T09:37:57.664765214Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-bfda34dd-93a3-48dd-89e5-5652b4ab540e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bfda34dd-93a3-48dd-89e5-5652b4ab540e
Content-Type: application/json

--- request body ---
{"handle":"qa-9bc2dddd9fbe","password":"****"}

--- response: 200 in 16 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-bfda34dd-93a3-48dd-89e5-5652b4ab540e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 272
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_978c627b-0712-4b4d-b5f4-d0d90ee23320"}
```

## 3. POST /v1/conversations/{id}/close

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/close
correlation: qa-711f7c86-e977-4e45-a57a-d830d13dbf60

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-711f7c86-e977-4e45-a57a-d830d13dbf60
Content-Type: application/json

--- response: 404 in 5 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-711f7c86-e977-4e45-a57a-d830d13dbf60
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/close","correlationId":"qa-711f7c86-e977-4e45-a57a-d830d13dbf60"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0ad37703-aca8-4d37-ad6c-00ce21553ad8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ad37703-aca8-4d37-ad6c-00ce21553ad8
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0ad37703-aca8-4d37-ad6c-00ce21553ad8
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
correlation: qa-5715a4ef-7695-4b77-a1cb-f4f77758c4f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5715a4ef-7695-4b77-a1cb-f4f77758c4f3
Content-Type: application/json

--- request body ---
{"handle":"qa-9bc2dddd9fbe","password":"****"}

--- response: 401 in 6 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5715a4ef-7695-4b77-a1cb-f4f77758c4f3
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5715a4ef-7695-4b77-a1cb-f4f77758c4f3"}
```
