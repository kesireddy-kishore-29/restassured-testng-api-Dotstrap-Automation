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
| 1 | `POST /v1/accounts` | 201 | 15 | `qa-c0b8d9d8-73b4-41f8-8e68-10e12df4a611` |
| 2 | `POST /v1/auth/token` | 200 | 25 | `qa-55ef6944-ca1f-4e8d-b1dc-99efd89de7b9` |
| 3 | `POST /v1/conversations/{id}/close` | 404 | 13 | `qa-666ad670-1f02-4b07-ba48-457cb8d10edb` |
| 4 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-ef0f1b77-7a06-457b-bf03-b8d45eb5018d` |
| 5 | `POST /v1/auth/token` | 401 | 8 | `qa-2ac14229-e369-4469-b303-08b8f4dfe053` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c0b8d9d8-73b4-41f8-8e68-10e12df4a611

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0b8d9d8-73b4-41f8-8e68-10e12df4a611
Content-Type: application/json

--- request body ---
{"handle":"qa-d7f637a33071","displayName":"QA d7f637a33071","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-c0b8d9d8-73b4-41f8-8e68-10e12df4a611
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 275
RateLimit-Reset: 6
Location: /v1/accounts/qa-d7f637a33071
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c592728a-608a-423c-9048-00537a8a61d7","handle":"qa-d7f637a33071","displayName":"QA d7f637a33071","region":"eu","role":"user","createdAt":"2026-11-14T09:05:13.201881955Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-55ef6944-ca1f-4e8d-b1dc-99efd89de7b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-55ef6944-ca1f-4e8d-b1dc-99efd89de7b9
Content-Type: application/json

--- request body ---
{"handle":"qa-d7f637a33071","password":"****"}

--- response: 200 in 25 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-55ef6944-ca1f-4e8d-b1dc-99efd89de7b9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 273
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c592728a-608a-423c-9048-00537a8a61d7"}
```

## 3. POST /v1/conversations/{id}/close

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/close
correlation: qa-666ad670-1f02-4b07-ba48-457cb8d10edb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-666ad670-1f02-4b07-ba48-457cb8d10edb
Content-Type: application/json

--- response: 404 in 13 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-666ad670-1f02-4b07-ba48-457cb8d10edb
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/close","correlationId":"qa-666ad670-1f02-4b07-ba48-457cb8d10edb"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ef0f1b77-7a06-457b-bf03-b8d45eb5018d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef0f1b77-7a06-457b-bf03-b8d45eb5018d
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ef0f1b77-7a06-457b-bf03-b8d45eb5018d
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
correlation: qa-2ac14229-e369-4469-b303-08b8f4dfe053

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ac14229-e369-4469-b303-08b8f4dfe053
Content-Type: application/json

--- request body ---
{"handle":"qa-d7f637a33071","password":"****"}

--- response: 401 in 8 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2ac14229-e369-4469-b303-08b8f4dfe053
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 271
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2ac14229-e369-4469-b303-08b8f4dfe053"}
```
