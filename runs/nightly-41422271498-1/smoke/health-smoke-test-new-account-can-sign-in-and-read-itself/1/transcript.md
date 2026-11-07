# Transcript: A new account can sign in and read itself back

| | |
|---|---|
| Test | `com.qaautomation.tests.smoke.HealthSmokeTest#newAccountCanSignInAndReadItself` |
| Features | FEAT-ACCT-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 308 | `qa-73ae24f3-ff74-4fdb-a5de-041fe791dbc4` |
| 2 | `POST /v1/auth/token` | 200 | 46 | `qa-fbf16eba-0b3d-4f35-92c6-8c3c610faf4e` |
| 3 | `GET /v1/accounts/me` | 200 | 39 | `qa-bef3dab3-bbca-4755-b42e-bf33b0dedef1` |
| 4 | `GET /v1/accounts/me` | 200 | 17 | `qa-397d1a69-5794-42ae-b854-9802c6d59bee` |
| 5 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-159561c6-ec08-4fe0-acbf-90a8456a8e1c` |
| 6 | `POST /v1/auth/token` | 401 | 16 | `qa-2601149d-5e7c-4b19-b2e7-d74f00f40129` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-73ae24f3-ff74-4fdb-a5de-041fe791dbc4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73ae24f3-ff74-4fdb-a5de-041fe791dbc4
Content-Type: application/json

--- request body ---
{"handle":"qa-7ac06bf9ac66","displayName":"QA 7ac06bf9ac66","password":"****","region":"eu"}

--- response: 201 in 308 ms ---
Date: Mon, 02 Nov 2026 09:38:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-73ae24f3-ff74-4fdb-a5de-041fe791dbc4
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
Location: /v1/accounts/qa-7ac06bf9ac66
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6031602c-3308-42d9-aded-4583ba4f85bb","handle":"qa-7ac06bf9ac66","displayName":"QA 7ac06bf9ac66","region":"eu","role":"user","createdAt":"2026-11-02T09:38:44.670336672Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-fbf16eba-0b3d-4f35-92c6-8c3c610faf4e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fbf16eba-0b3d-4f35-92c6-8c3c610faf4e
Content-Type: application/json

--- request body ---
{"handle":"qa-7ac06bf9ac66","password":"****"}

--- response: 200 in 46 ms ---
Date: Mon, 02 Nov 2026 09:38:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-fbf16eba-0b3d-4f35-92c6-8c3c610faf4e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6031602c-3308-42d9-aded-4583ba4f85bb"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-bef3dab3-bbca-4755-b42e-bf33b0dedef1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bef3dab3-bbca-4755-b42e-bf33b0dedef1
Content-Type: application/json

--- response: 200 in 39 ms ---
Date: Mon, 02 Nov 2026 09:38:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-bef3dab3-bbca-4755-b42e-bf33b0dedef1
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
Content-Length: 181

{"id":"acc_6031602c-3308-42d9-aded-4583ba4f85bb","handle":"qa-7ac06bf9ac66","displayName":"QA 7ac06bf9ac66","region":"eu","role":"user","createdAt":"2026-11-02T09:38:44.670336672Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-397d1a69-5794-42ae-b854-9802c6d59bee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-397d1a69-5794-42ae-b854-9802c6d59bee
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Mon, 02 Nov 2026 09:38:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-397d1a69-5794-42ae-b854-9802c6d59bee
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
Content-Length: 181

{"id":"acc_6031602c-3308-42d9-aded-4583ba4f85bb","handle":"qa-7ac06bf9ac66","displayName":"QA 7ac06bf9ac66","region":"eu","role":"user","createdAt":"2026-11-02T09:38:44.670336672Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-159561c6-ec08-4fe0-acbf-90a8456a8e1c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-159561c6-ec08-4fe0-acbf-90a8456a8e1c
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Mon, 02 Nov 2026 09:38:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-159561c6-ec08-4fe0-acbf-90a8456a8e1c
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
correlation: qa-2601149d-5e7c-4b19-b2e7-d74f00f40129

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2601149d-5e7c-4b19-b2e7-d74f00f40129
Content-Type: application/json

--- request body ---
{"handle":"qa-7ac06bf9ac66","password":"****"}

--- response: 401 in 16 ms ---
Date: Mon, 02 Nov 2026 09:38:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2601149d-5e7c-4b19-b2e7-d74f00f40129
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2601149d-5e7c-4b19-b2e7-d74f00f40129"}
```
