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
| 1 | `POST /v1/accounts` | 201 | 441 | `qa-a2819e1d-3e13-4441-9161-e65e83671c89` |
| 2 | `POST /v1/auth/token` | 200 | 63 | `qa-018a8cba-487a-41ae-8511-1be5b4e0e45a` |
| 3 | `PATCH /v1/accounts/me` | 200 | 58 | `qa-d056acd4-175e-417f-b9bb-1b98ebbf7bf0` |
| 4 | `GET /v1/accounts/me` | 200 | 9 | `qa-79d94dac-672b-429c-af9c-fd112ba3076f` |
| 5 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-78344940-39bf-41bc-ba70-d80122d85f83` |
| 6 | `POST /v1/auth/token` | 401 | 19 | `qa-904d408b-bef5-49b4-ab2f-66a3ee550193` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a2819e1d-3e13-4441-9161-e65e83671c89

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2819e1d-3e13-4441-9161-e65e83671c89
Content-Type: application/json

--- request body ---
{"handle":"qa-a82fc8fc4811","displayName":"QA a82fc8fc4811","password":"****","region":"eu"}

--- response: 201 in 441 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-a2819e1d-3e13-4441-9161-e65e83671c89
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-a82fc8fc4811
X-Served-Region: eu
Content-Length: 181

{"id":"acc_067be392-1c7a-4815-9661-940edd30d0e8","handle":"qa-a82fc8fc4811","displayName":"QA a82fc8fc4811","region":"eu","role":"user","createdAt":"2026-10-29T08:38:57.341034238Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-018a8cba-487a-41ae-8511-1be5b4e0e45a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-018a8cba-487a-41ae-8511-1be5b4e0e45a
Content-Type: application/json

--- request body ---
{"handle":"qa-a82fc8fc4811","password":"****"}

--- response: 200 in 63 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-018a8cba-487a-41ae-8511-1be5b4e0e45a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_067be392-1c7a-4815-9661-940edd30d0e8"}
```

## 3. PATCH /v1/accounts/me

```text
#3 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-d056acd4-175e-417f-b9bb-1b98ebbf7bf0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d056acd4-175e-417f-b9bb-1b98ebbf7bf0
Content-Type: application/json

--- request body ---
{"displayName":"Ava Lindqvist"}

--- response: 200 in 58 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-d056acd4-175e-417f-b9bb-1b98ebbf7bf0
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

{"id":"acc_067be392-1c7a-4815-9661-940edd30d0e8","handle":"qa-a82fc8fc4811","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-10-29T08:38:57.341034238Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-79d94dac-672b-429c-af9c-fd112ba3076f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79d94dac-672b-429c-af9c-fd112ba3076f
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-79d94dac-672b-429c-af9c-fd112ba3076f
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

{"id":"acc_067be392-1c7a-4815-9661-940edd30d0e8","handle":"qa-a82fc8fc4811","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-10-29T08:38:57.341034238Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-78344940-39bf-41bc-ba70-d80122d85f83

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78344940-39bf-41bc-ba70-d80122d85f83
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-78344940-39bf-41bc-ba70-d80122d85f83
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
correlation: qa-904d408b-bef5-49b4-ab2f-66a3ee550193

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-904d408b-bef5-49b4-ab2f-66a3ee550193
Content-Type: application/json

--- request body ---
{"handle":"qa-a82fc8fc4811","password":"****"}

--- response: 401 in 19 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-904d408b-bef5-49b4-ab2f-66a3ee550193
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-904d408b-bef5-49b4-ab2f-66a3ee550193"}
```
