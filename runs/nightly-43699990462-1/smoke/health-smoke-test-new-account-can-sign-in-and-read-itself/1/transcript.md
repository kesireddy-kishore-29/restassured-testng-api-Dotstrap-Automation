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
| 1 | `POST /v1/accounts` | 201 | 369 | `qa-f548cd72-858d-4138-bee7-e05b6c47336c` |
| 2 | `POST /v1/auth/token` | 200 | 37 | `qa-ac2f657f-d17d-4b04-8281-bde7e75c4956` |
| 3 | `GET /v1/accounts/me` | 200 | 56 | `qa-dc1151f0-d32c-4fa1-9544-7904e84bd722` |
| 4 | `GET /v1/accounts/me` | 200 | 15 | `qa-043d4aad-c725-407f-89c5-f4e95d1bddd7` |
| 5 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-34c35abf-b204-4ef4-911a-708470120be3` |
| 6 | `POST /v1/auth/token` | 401 | 15 | `qa-6f11c6b1-ea8b-4da5-b4ef-f28e08d80a51` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f548cd72-858d-4138-bee7-e05b6c47336c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f548cd72-858d-4138-bee7-e05b6c47336c
Content-Type: application/json

--- request body ---
{"handle":"qa-6dc444bac3ae","displayName":"QA 6dc444bac3ae","password":"****","region":"eu"}

--- response: 201 in 369 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-f548cd72-858d-4138-bee7-e05b6c47336c
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
Location: /v1/accounts/qa-6dc444bac3ae
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0619ca5c-92d5-478d-a387-5e085193bb4e","handle":"qa-6dc444bac3ae","displayName":"QA 6dc444bac3ae","region":"eu","role":"user","createdAt":"2026-11-15T09:36:08.927921810Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-ac2f657f-d17d-4b04-8281-bde7e75c4956

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac2f657f-d17d-4b04-8281-bde7e75c4956
Content-Type: application/json

--- request body ---
{"handle":"qa-6dc444bac3ae","password":"****"}

--- response: 200 in 37 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-ac2f657f-d17d-4b04-8281-bde7e75c4956
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0619ca5c-92d5-478d-a387-5e085193bb4e"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-dc1151f0-d32c-4fa1-9544-7904e84bd722

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc1151f0-d32c-4fa1-9544-7904e84bd722
Content-Type: application/json

--- response: 200 in 56 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc1151f0-d32c-4fa1-9544-7904e84bd722
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

{"id":"acc_0619ca5c-92d5-478d-a387-5e085193bb4e","handle":"qa-6dc444bac3ae","displayName":"QA 6dc444bac3ae","region":"eu","role":"user","createdAt":"2026-11-15T09:36:08.927921810Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-043d4aad-c725-407f-89c5-f4e95d1bddd7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-043d4aad-c725-407f-89c5-f4e95d1bddd7
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-043d4aad-c725-407f-89c5-f4e95d1bddd7
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

{"id":"acc_0619ca5c-92d5-478d-a387-5e085193bb4e","handle":"qa-6dc444bac3ae","displayName":"QA 6dc444bac3ae","region":"eu","role":"user","createdAt":"2026-11-15T09:36:08.927921810Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-34c35abf-b204-4ef4-911a-708470120be3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34c35abf-b204-4ef4-911a-708470120be3
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-34c35abf-b204-4ef4-911a-708470120be3
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
correlation: qa-6f11c6b1-ea8b-4da5-b4ef-f28e08d80a51

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f11c6b1-ea8b-4da5-b4ef-f28e08d80a51
Content-Type: application/json

--- request body ---
{"handle":"qa-6dc444bac3ae","password":"****"}

--- response: 401 in 15 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6f11c6b1-ea8b-4da5-b4ef-f28e08d80a51
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6f11c6b1-ea8b-4da5-b4ef-f28e08d80a51"}
```
