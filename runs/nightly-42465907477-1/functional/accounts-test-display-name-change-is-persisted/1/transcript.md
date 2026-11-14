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
| 1 | `POST /v1/accounts` | 201 | 348 | `qa-5052a21e-1027-4ddd-97c0-ff701a9a0f58` |
| 2 | `POST /v1/auth/token` | 200 | 42 | `qa-ea5b1c47-fb6d-4ee9-adca-f4d20a69e94a` |
| 3 | `PATCH /v1/accounts/me` | 200 | 59 | `qa-a49b4ae4-aeec-4c05-b6b3-e25537f933f8` |
| 4 | `GET /v1/accounts/me` | 200 | 16 | `qa-f84785e3-b4d9-45cd-90ad-7fdc2569f054` |
| 5 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-7a15ec79-4e26-4b97-99bc-b2db0ef0cb32` |
| 6 | `POST /v1/auth/token` | 401 | 54 | `qa-9a53d5b8-6393-4248-a48b-a14cb0ad68ba` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5052a21e-1027-4ddd-97c0-ff701a9a0f58

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5052a21e-1027-4ddd-97c0-ff701a9a0f58
Content-Type: application/json

--- request body ---
{"handle":"qa-3d4b5e0f83fc","displayName":"QA 3d4b5e0f83fc","password":"****","region":"eu"}

--- response: 201 in 348 ms ---
Date: Sun, 08 Nov 2026 09:09:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-5052a21e-1027-4ddd-97c0-ff701a9a0f58
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-3d4b5e0f83fc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a262689d-1ac3-4d2a-afc2-3e35e3e50ec5","handle":"qa-3d4b5e0f83fc","displayName":"QA 3d4b5e0f83fc","region":"eu","role":"user","createdAt":"2026-11-08T09:09:14.349042937Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-ea5b1c47-fb6d-4ee9-adca-f4d20a69e94a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea5b1c47-fb6d-4ee9-adca-f4d20a69e94a
Content-Type: application/json

--- request body ---
{"handle":"qa-3d4b5e0f83fc","password":"****"}

--- response: 200 in 42 ms ---
Date: Sun, 08 Nov 2026 09:09:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-ea5b1c47-fb6d-4ee9-adca-f4d20a69e94a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a262689d-1ac3-4d2a-afc2-3e35e3e50ec5"}
```

## 3. PATCH /v1/accounts/me

```text
#3 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-a49b4ae4-aeec-4c05-b6b3-e25537f933f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a49b4ae4-aeec-4c05-b6b3-e25537f933f8
Content-Type: application/json

--- request body ---
{"displayName":"Ava Lindqvist"}

--- response: 200 in 59 ms ---
Date: Sun, 08 Nov 2026 09:09:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-a49b4ae4-aeec-4c05-b6b3-e25537f933f8
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

{"id":"acc_a262689d-1ac3-4d2a-afc2-3e35e3e50ec5","handle":"qa-3d4b5e0f83fc","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-11-08T09:09:14.349042937Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-f84785e3-b4d9-45cd-90ad-7fdc2569f054

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f84785e3-b4d9-45cd-90ad-7fdc2569f054
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sun, 08 Nov 2026 09:09:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-f84785e3-b4d9-45cd-90ad-7fdc2569f054
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

{"id":"acc_a262689d-1ac3-4d2a-afc2-3e35e3e50ec5","handle":"qa-3d4b5e0f83fc","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-11-08T09:09:14.349042937Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7a15ec79-4e26-4b97-99bc-b2db0ef0cb32

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a15ec79-4e26-4b97-99bc-b2db0ef0cb32
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sun, 08 Nov 2026 09:09:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7a15ec79-4e26-4b97-99bc-b2db0ef0cb32
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
correlation: qa-9a53d5b8-6393-4248-a48b-a14cb0ad68ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a53d5b8-6393-4248-a48b-a14cb0ad68ba
Content-Type: application/json

--- request body ---
{"handle":"qa-3d4b5e0f83fc","password":"****"}

--- response: 401 in 54 ms ---
Date: Sun, 08 Nov 2026 09:09:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9a53d5b8-6393-4248-a48b-a14cb0ad68ba
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9a53d5b8-6393-4248-a48b-a14cb0ad68ba"}
```
