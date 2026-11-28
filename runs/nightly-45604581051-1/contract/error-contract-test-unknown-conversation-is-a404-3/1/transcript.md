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
| 1 | `POST /v1/accounts` | 201 | 14 | `qa-52091e5e-2da7-4d81-9d50-4917e1e8cb1a` |
| 2 | `POST /v1/auth/token` | 200 | 17 | `qa-1d798e54-dd4a-4264-8f13-d46c71d2d42a` |
| 3 | `POST /v1/conversations/{id}/read` | 404 | 18 | `qa-23663bb8-e36a-41fe-9db5-cb85ac574721` |
| 4 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-063a0da8-82ce-4585-a20d-06fdd08197ae` |
| 5 | `POST /v1/auth/token` | 401 | 11 | `qa-6c50681c-69df-404a-989e-fca8a686d24d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-52091e5e-2da7-4d81-9d50-4917e1e8cb1a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52091e5e-2da7-4d81-9d50-4917e1e8cb1a
Content-Type: application/json

--- request body ---
{"handle":"qa-2b7847b1255f","displayName":"QA 2b7847b1255f","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-52091e5e-2da7-4d81-9d50-4917e1e8cb1a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 284
RateLimit-Reset: 7
Location: /v1/accounts/qa-2b7847b1255f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e26f126f-c7b4-4efb-b61f-8afcc3a89e7a","handle":"qa-2b7847b1255f","displayName":"QA 2b7847b1255f","region":"eu","role":"user","createdAt":"2026-11-25T11:27:59.846445772Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-1d798e54-dd4a-4264-8f13-d46c71d2d42a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d798e54-dd4a-4264-8f13-d46c71d2d42a
Content-Type: application/json

--- request body ---
{"handle":"qa-2b7847b1255f","password":"****"}

--- response: 200 in 17 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-1d798e54-dd4a-4264-8f13-d46c71d2d42a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 279
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e26f126f-c7b4-4efb-b61f-8afcc3a89e7a"}
```

## 3. POST /v1/conversations/{id}/read

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/read
correlation: qa-23663bb8-e36a-41fe-9db5-cb85ac574721

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23663bb8-e36a-41fe-9db5-cb85ac574721
Content-Type: application/json

--- response: 404 in 18 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-23663bb8-e36a-41fe-9db5-cb85ac574721
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/read","correlationId":"qa-23663bb8-e36a-41fe-9db5-cb85ac574721"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-063a0da8-82ce-4585-a20d-06fdd08197ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-063a0da8-82ce-4585-a20d-06fdd08197ae
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-063a0da8-82ce-4585-a20d-06fdd08197ae
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
correlation: qa-6c50681c-69df-404a-989e-fca8a686d24d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c50681c-69df-404a-989e-fca8a686d24d
Content-Type: application/json

--- request body ---
{"handle":"qa-2b7847b1255f","password":"****"}

--- response: 401 in 11 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6c50681c-69df-404a-989e-fca8a686d24d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 277
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6c50681c-69df-404a-989e-fca8a686d24d"}
```
