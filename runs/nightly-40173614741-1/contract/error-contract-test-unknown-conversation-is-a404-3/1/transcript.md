# Transcript: Every conversation operation answers an unknown id with a 404 problem [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[3]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 15 | `qa-574a23ca-c8e2-44d0-ab3b-512c298f758d` |
| 2 | `POST /v1/auth/token` | 200 | 25 | `qa-25edd33f-d78f-4f13-8262-20fef934588a` |
| 3 | `POST /v1/conversations/{id}/read` | 404 | 12 | `qa-30c8d508-ab09-440b-86d6-8d67839ee686` |
| 4 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-3b12ca1e-2458-487a-b2b6-f1c0aa2fd1ab` |
| 5 | `POST /v1/auth/token` | 401 | 6 | `qa-6ace306b-0c10-446c-b452-af3841f511df` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-574a23ca-c8e2-44d0-ab3b-512c298f758d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-574a23ca-c8e2-44d0-ab3b-512c298f758d
Content-Type: application/json

--- request body ---
{"handle":"qa-c8c812debd9e","displayName":"QA c8c812debd9e","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-574a23ca-c8e2-44d0-ab3b-512c298f758d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 289
RateLimit-Reset: 6
Location: /v1/accounts/qa-c8c812debd9e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4d54b0af-87b1-4149-9ab3-0f3004d04866","handle":"qa-c8c812debd9e","displayName":"QA c8c812debd9e","region":"eu","role":"user","createdAt":"2026-10-25T07:40:27.446170779Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-25edd33f-d78f-4f13-8262-20fef934588a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25edd33f-d78f-4f13-8262-20fef934588a
Content-Type: application/json

--- request body ---
{"handle":"qa-c8c812debd9e","password":"****"}

--- response: 200 in 25 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-25edd33f-d78f-4f13-8262-20fef934588a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 283
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4d54b0af-87b1-4149-9ab3-0f3004d04866"}
```

## 3. POST /v1/conversations/{id}/read

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/read
correlation: qa-30c8d508-ab09-440b-86d6-8d67839ee686

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30c8d508-ab09-440b-86d6-8d67839ee686
Content-Type: application/json

--- response: 404 in 12 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-30c8d508-ab09-440b-86d6-8d67839ee686
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
Content-Length: 258

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/read","correlationId":"qa-30c8d508-ab09-440b-86d6-8d67839ee686"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3b12ca1e-2458-487a-b2b6-f1c0aa2fd1ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b12ca1e-2458-487a-b2b6-f1c0aa2fd1ab
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3b12ca1e-2458-487a-b2b6-f1c0aa2fd1ab
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
correlation: qa-6ace306b-0c10-446c-b452-af3841f511df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ace306b-0c10-446c-b452-af3841f511df
Content-Type: application/json

--- request body ---
{"handle":"qa-c8c812debd9e","password":"****"}

--- response: 401 in 6 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6ace306b-0c10-446c-b452-af3841f511df
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6ace306b-0c10-446c-b452-af3841f511df"}
```
