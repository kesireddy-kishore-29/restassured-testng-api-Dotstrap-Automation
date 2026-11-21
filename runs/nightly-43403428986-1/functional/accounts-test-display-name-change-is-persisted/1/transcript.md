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
| 1 | `POST /v1/accounts` | 201 | 425 | `qa-9a47e060-2d8b-4b5f-89c6-c1ee1fb7691d` |
| 2 | `POST /v1/auth/token` | 200 | 52 | `qa-cb2e7e38-852b-4cce-b30e-2f039f83ecef` |
| 3 | `PATCH /v1/accounts/me` | 200 | 49 | `qa-f60cf69a-6d9c-4ffd-a91c-f0071e0479ab` |
| 4 | `GET /v1/accounts/me` | 200 | 16 | `qa-ed386d73-d74e-4f87-a1be-3e0741440170` |
| 5 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-70abf98c-d404-4ac0-8bad-f5778292b563` |
| 6 | `POST /v1/auth/token` | 401 | 38 | `qa-9cbcf8ae-a656-4bf5-aea0-39947490a370` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9a47e060-2d8b-4b5f-89c6-c1ee1fb7691d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a47e060-2d8b-4b5f-89c6-c1ee1fb7691d
Content-Type: application/json

--- request body ---
{"handle":"qa-92979b614d11","displayName":"QA 92979b614d11","password":"****","region":"eu"}

--- response: 201 in 425 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-9a47e060-2d8b-4b5f-89c6-c1ee1fb7691d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-92979b614d11
X-Served-Region: eu
Content-Length: 181

{"id":"acc_610378ec-448c-48e4-986f-a6934ab430a8","handle":"qa-92979b614d11","displayName":"QA 92979b614d11","region":"eu","role":"user","createdAt":"2026-11-13T09:42:06.945082137Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-cb2e7e38-852b-4cce-b30e-2f039f83ecef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb2e7e38-852b-4cce-b30e-2f039f83ecef
Content-Type: application/json

--- request body ---
{"handle":"qa-92979b614d11","password":"****"}

--- response: 200 in 52 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-cb2e7e38-852b-4cce-b30e-2f039f83ecef
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_610378ec-448c-48e4-986f-a6934ab430a8"}
```

## 3. PATCH /v1/accounts/me

```text
#3 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-f60cf69a-6d9c-4ffd-a91c-f0071e0479ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f60cf69a-6d9c-4ffd-a91c-f0071e0479ab
Content-Type: application/json

--- request body ---
{"displayName":"Ava Lindqvist"}

--- response: 200 in 49 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-f60cf69a-6d9c-4ffd-a91c-f0071e0479ab
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

{"id":"acc_610378ec-448c-48e4-986f-a6934ab430a8","handle":"qa-92979b614d11","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-11-13T09:42:06.945082137Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-ed386d73-d74e-4f87-a1be-3e0741440170

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed386d73-d74e-4f87-a1be-3e0741440170
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-ed386d73-d74e-4f87-a1be-3e0741440170
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

{"id":"acc_610378ec-448c-48e4-986f-a6934ab430a8","handle":"qa-92979b614d11","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-11-13T09:42:06.945082137Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-70abf98c-d404-4ac0-8bad-f5778292b563

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70abf98c-d404-4ac0-8bad-f5778292b563
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-70abf98c-d404-4ac0-8bad-f5778292b563
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
correlation: qa-9cbcf8ae-a656-4bf5-aea0-39947490a370

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9cbcf8ae-a656-4bf5-aea0-39947490a370
Content-Type: application/json

--- request body ---
{"handle":"qa-92979b614d11","password":"****"}

--- response: 401 in 38 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9cbcf8ae-a656-4bf5-aea0-39947490a370
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9cbcf8ae-a656-4bf5-aea0-39947490a370"}
```
