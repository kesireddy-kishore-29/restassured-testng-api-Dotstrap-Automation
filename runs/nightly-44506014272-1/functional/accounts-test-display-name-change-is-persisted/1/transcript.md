# Transcript: A new display name is stored and returned

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.AccountsTest#displayNameChangeIsPersisted` |
| Features | FEAT-ACCT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 360 | `qa-2722e4c3-bc46-4567-9104-e352fdd284ea` |
| 2 | `POST /v1/auth/token` | 200 | 43 | `qa-2bb75129-a398-435b-8a86-a9733cd5b949` |
| 3 | `PATCH /v1/accounts/me` | 200 | 46 | `qa-1bb75874-67a8-4c82-952f-4184890b3e28` |
| 4 | `GET /v1/accounts/me` | 200 | 14 | `qa-b76db154-3b6d-4993-9d4c-084710492c75` |
| 5 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-bb8f101c-f296-4fe0-9b14-e34918618a2f` |
| 6 | `POST /v1/auth/token` | 401 | 24 | `qa-dc2f2afa-eca4-42e3-bdb7-416e4ed0960e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2722e4c3-bc46-4567-9104-e352fdd284ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2722e4c3-bc46-4567-9104-e352fdd284ea
Content-Type: application/json

--- request body ---
{"handle":"qa-da5b9668e8fb","displayName":"QA da5b9668e8fb","password":"****","region":"eu"}

--- response: 201 in 360 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-2722e4c3-bc46-4567-9104-e352fdd284ea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-da5b9668e8fb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_755db629-4c61-4887-80d1-6692c7fe8b76","handle":"qa-da5b9668e8fb","displayName":"QA da5b9668e8fb","region":"eu","role":"user","createdAt":"2026-11-19T10:29:14.978396692Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-2bb75129-a398-435b-8a86-a9733cd5b949

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2bb75129-a398-435b-8a86-a9733cd5b949
Content-Type: application/json

--- request body ---
{"handle":"qa-da5b9668e8fb","password":"****"}

--- response: 200 in 43 ms ---
Date: Thu, 19 Nov 2026 10:29:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-2bb75129-a398-435b-8a86-a9733cd5b949
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_755db629-4c61-4887-80d1-6692c7fe8b76"}
```

## 3. PATCH /v1/accounts/me

```text
#3 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-1bb75874-67a8-4c82-952f-4184890b3e28

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1bb75874-67a8-4c82-952f-4184890b3e28
Content-Type: application/json

--- request body ---
{"displayName":"Ava Lindqvist"}

--- response: 200 in 46 ms ---
Date: Thu, 19 Nov 2026 10:29:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-1bb75874-67a8-4c82-952f-4184890b3e28
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
Content-Length: 179

{"id":"acc_755db629-4c61-4887-80d1-6692c7fe8b76","handle":"qa-da5b9668e8fb","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-11-19T10:29:14.978396692Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-b76db154-3b6d-4993-9d4c-084710492c75

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b76db154-3b6d-4993-9d4c-084710492c75
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Thu, 19 Nov 2026 10:29:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-b76db154-3b6d-4993-9d4c-084710492c75
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
Content-Length: 179

{"id":"acc_755db629-4c61-4887-80d1-6692c7fe8b76","handle":"qa-da5b9668e8fb","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-11-19T10:29:14.978396692Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bb8f101c-f296-4fe0-9b14-e34918618a2f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb8f101c-f296-4fe0-9b14-e34918618a2f
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Thu, 19 Nov 2026 10:29:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bb8f101c-f296-4fe0-9b14-e34918618a2f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-dc2f2afa-eca4-42e3-bdb7-416e4ed0960e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc2f2afa-eca4-42e3-bdb7-416e4ed0960e
Content-Type: application/json

--- request body ---
{"handle":"qa-da5b9668e8fb","password":"****"}

--- response: 401 in 24 ms ---
Date: Thu, 19 Nov 2026 10:29:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dc2f2afa-eca4-42e3-bdb7-416e4ed0960e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-dc2f2afa-eca4-42e3-bdb7-416e4ed0960e"}
```
