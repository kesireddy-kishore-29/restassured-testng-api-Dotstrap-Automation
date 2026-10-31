# Transcript: Every conversation operation answers an unknown id with a 404 problem [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[2]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 15 | `qa-7c169444-517a-463c-940a-9e79994b0fa1` |
| 2 | `POST /v1/auth/token` | 200 | 28 | `qa-0962916b-cabd-445b-a252-e5a1b601a851` |
| 3 | `POST /v1/conversations/{id}/messages` | 404 | 16 | `qa-85b9aae4-cfb4-4923-8f68-6c7e57f89ebb` |
| 4 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-29d9963a-f892-4b3b-9387-9b2b87a9a71e` |
| 5 | `POST /v1/auth/token` | 401 | 4 | `qa-fbe3903b-af46-48d3-adbb-4e7efd5ccc7b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7c169444-517a-463c-940a-9e79994b0fa1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c169444-517a-463c-940a-9e79994b0fa1
Content-Type: application/json

--- request body ---
{"handle":"qa-a71a5b631c27","displayName":"QA a71a5b631c27","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-7c169444-517a-463c-940a-9e79994b0fa1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 286
RateLimit-Reset: 7
Location: /v1/accounts/qa-a71a5b631c27
X-Served-Region: eu
Content-Length: 181

{"id":"acc_522d5fe3-f9d5-41eb-92b2-49d6c1cc0085","handle":"qa-a71a5b631c27","displayName":"QA a71a5b631c27","region":"eu","role":"user","createdAt":"2026-10-24T07:25:04.274873610Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-0962916b-cabd-445b-a252-e5a1b601a851

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0962916b-cabd-445b-a252-e5a1b601a851
Content-Type: application/json

--- request body ---
{"handle":"qa-a71a5b631c27","password":"****"}

--- response: 200 in 28 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-0962916b-cabd-445b-a252-e5a1b601a851
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 282
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_522d5fe3-f9d5-41eb-92b2-49d6c1cc0085"}
```

## 3. POST /v1/conversations/{id}/messages

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-85b9aae4-cfb4-4923-8f68-6c7e57f89ebb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85b9aae4-cfb4-4923-8f68-6c7e57f89ebb
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 404 in 16 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-85b9aae4-cfb4-4923-8f68-6c7e57f89ebb
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-85b9aae4-cfb4-4923-8f68-6c7e57f89ebb"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-29d9963a-f892-4b3b-9387-9b2b87a9a71e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29d9963a-f892-4b3b-9387-9b2b87a9a71e
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-29d9963a-f892-4b3b-9387-9b2b87a9a71e
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
correlation: qa-fbe3903b-af46-48d3-adbb-4e7efd5ccc7b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fbe3903b-af46-48d3-adbb-4e7efd5ccc7b
Content-Type: application/json

--- request body ---
{"handle":"qa-a71a5b631c27","password":"****"}

--- response: 401 in 4 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fbe3903b-af46-48d3-adbb-4e7efd5ccc7b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 272
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fbe3903b-af46-48d3-adbb-4e7efd5ccc7b"}
```
