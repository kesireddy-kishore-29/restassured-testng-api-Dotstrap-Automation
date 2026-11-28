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
| 1 | `POST /v1/accounts` | 201 | 421 | `qa-b9bdc194-956e-4f87-bc90-fe7996622a1f` |
| 2 | `POST /v1/auth/token` | 200 | 43 | `qa-f6fec0b4-1663-4c3b-9500-f6b102972f96` |
| 3 | `PATCH /v1/accounts/me` | 200 | 31 | `qa-1bdc6714-63b4-4905-82f6-e7b6a854f164` |
| 4 | `GET /v1/accounts/me` | 200 | 19 | `qa-082738b5-7a52-4b60-97a9-1c9feaffe227` |
| 5 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-fe3211d4-188c-4ce6-9576-bc142409a8d6` |
| 6 | `POST /v1/auth/token` | 401 | 21 | `qa-dd76dfb3-f04c-4bb5-8e1f-b72ab29fdd95` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b9bdc194-956e-4f87-bc90-fe7996622a1f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9bdc194-956e-4f87-bc90-fe7996622a1f
Content-Type: application/json

--- request body ---
{"handle":"qa-40e7b82d6225","displayName":"QA 40e7b82d6225","password":"****","region":"eu"}

--- response: 201 in 421 ms ---
Date: Sat, 28 Nov 2026 10:37:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9bdc194-956e-4f87-bc90-fe7996622a1f
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
Location: /v1/accounts/qa-40e7b82d6225
X-Served-Region: eu
Content-Length: 181

{"id":"acc_82589b56-c0f8-4b3d-8cbf-fad29ef1c23c","handle":"qa-40e7b82d6225","displayName":"QA 40e7b82d6225","region":"eu","role":"user","createdAt":"2026-11-28T10:37:14.251209620Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-f6fec0b4-1663-4c3b-9500-f6b102972f96

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6fec0b4-1663-4c3b-9500-f6b102972f96
Content-Type: application/json

--- request body ---
{"handle":"qa-40e7b82d6225","password":"****"}

--- response: 200 in 43 ms ---
Date: Sat, 28 Nov 2026 10:37:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-f6fec0b4-1663-4c3b-9500-f6b102972f96
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_82589b56-c0f8-4b3d-8cbf-fad29ef1c23c"}
```

## 3. PATCH /v1/accounts/me

```text
#3 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-1bdc6714-63b4-4905-82f6-e7b6a854f164

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1bdc6714-63b4-4905-82f6-e7b6a854f164
Content-Type: application/json

--- request body ---
{"displayName":"Ava Lindqvist"}

--- response: 200 in 31 ms ---
Date: Sat, 28 Nov 2026 10:37:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-1bdc6714-63b4-4905-82f6-e7b6a854f164
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

{"id":"acc_82589b56-c0f8-4b3d-8cbf-fad29ef1c23c","handle":"qa-40e7b82d6225","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-11-28T10:37:14.251209620Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-082738b5-7a52-4b60-97a9-1c9feaffe227

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-082738b5-7a52-4b60-97a9-1c9feaffe227
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sat, 28 Nov 2026 10:37:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-082738b5-7a52-4b60-97a9-1c9feaffe227
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

{"id":"acc_82589b56-c0f8-4b3d-8cbf-fad29ef1c23c","handle":"qa-40e7b82d6225","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-11-28T10:37:14.251209620Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fe3211d4-188c-4ce6-9576-bc142409a8d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe3211d4-188c-4ce6-9576-bc142409a8d6
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sat, 28 Nov 2026 10:37:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fe3211d4-188c-4ce6-9576-bc142409a8d6
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
correlation: qa-dd76dfb3-f04c-4bb5-8e1f-b72ab29fdd95

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd76dfb3-f04c-4bb5-8e1f-b72ab29fdd95
Content-Type: application/json

--- request body ---
{"handle":"qa-40e7b82d6225","password":"****"}

--- response: 401 in 21 ms ---
Date: Sat, 28 Nov 2026 10:37:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dd76dfb3-f04c-4bb5-8e1f-b72ab29fdd95
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-dd76dfb3-f04c-4bb5-8e1f-b72ab29fdd95"}
```
