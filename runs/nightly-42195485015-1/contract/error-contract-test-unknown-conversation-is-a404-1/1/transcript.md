# Transcript: Every conversation operation answers an unknown id with a 404 problem [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[1]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-57201548-5ccf-4b00-9758-60c8484ac9da` |
| 2 | `POST /v1/auth/token` | 200 | 31 | `qa-bb9c92fa-503c-4d26-9b0b-5337b6f0254f` |
| 3 | `GET /v1/conversations/{id}/messages` | 404 | 19 | `qa-5448a852-c982-405d-aaba-cecf7bd0e583` |
| 4 | `DELETE /v1/accounts/me` | 204 | 35 | `qa-ea0a07fb-c723-4235-8c69-e7bc02026ad5` |
| 5 | `POST /v1/auth/token` | 401 | 10 | `qa-6cbc0358-1857-48a9-aca3-6cb18a1c659b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-57201548-5ccf-4b00-9758-60c8484ac9da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57201548-5ccf-4b00-9758-60c8484ac9da
Content-Type: application/json

--- request body ---
{"handle":"qa-510887905313","displayName":"QA 510887905313","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-57201548-5ccf-4b00-9758-60c8484ac9da
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 287
RateLimit-Reset: 5
Location: /v1/accounts/qa-510887905313
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ae9ef979-8fe9-4617-82d5-4eeee7554494","handle":"qa-510887905313","displayName":"QA 510887905313","region":"eu","role":"user","createdAt":"2026-11-06T09:30:35.161123996Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-bb9c92fa-503c-4d26-9b0b-5337b6f0254f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb9c92fa-503c-4d26-9b0b-5337b6f0254f
Content-Type: application/json

--- request body ---
{"handle":"qa-510887905313","password":"****"}

--- response: 200 in 31 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb9c92fa-503c-4d26-9b0b-5337b6f0254f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 282
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ae9ef979-8fe9-4617-82d5-4eeee7554494"}
```

## 3. GET /v1/conversations/{id}/messages

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-5448a852-c982-405d-aaba-cecf7bd0e583

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5448a852-c982-405d-aaba-cecf7bd0e583
Content-Type: application/json

--- response: 404 in 19 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5448a852-c982-405d-aaba-cecf7bd0e583
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-5448a852-c982-405d-aaba-cecf7bd0e583"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ea0a07fb-c723-4235-8c69-e7bc02026ad5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea0a07fb-c723-4235-8c69-e7bc02026ad5
Content-Type: application/json

--- response: 204 in 35 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ea0a07fb-c723-4235-8c69-e7bc02026ad5
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
correlation: qa-6cbc0358-1857-48a9-aca3-6cb18a1c659b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6cbc0358-1857-48a9-aca3-6cb18a1c659b
Content-Type: application/json

--- request body ---
{"handle":"qa-510887905313","password":"****"}

--- response: 401 in 10 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6cbc0358-1857-48a9-aca3-6cb18a1c659b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 277
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6cbc0358-1857-48a9-aca3-6cb18a1c659b"}
```
