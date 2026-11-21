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
| 1 | `POST /v1/accounts` | 201 | 10 | `qa-e85b16bb-4d28-4b64-82b6-167f2f055e35` |
| 2 | `POST /v1/auth/token` | 200 | 8 | `qa-13d7f5f2-990a-49be-9beb-318cd15c9845` |
| 3 | `POST /v1/conversations/{id}/close` | 404 | 9 | `qa-4c1a3eb5-35e0-404a-bb59-4f8254afe5c1` |
| 4 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-230c97c7-34b1-4dc8-9c16-294043135c7b` |
| 5 | `POST /v1/auth/token` | 401 | 3 | `qa-aa44fa59-4634-456d-bf8e-a180ee83d6f3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e85b16bb-4d28-4b64-82b6-167f2f055e35

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e85b16bb-4d28-4b64-82b6-167f2f055e35
Content-Type: application/json

--- request body ---
{"handle":"qa-7ec0f5fa4ea8","displayName":"QA 7ec0f5fa4ea8","password":"****","region":"eu"}

--- response: 201 in 10 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-e85b16bb-4d28-4b64-82b6-167f2f055e35
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 274
RateLimit-Reset: 7
Location: /v1/accounts/qa-7ec0f5fa4ea8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c0ca5d62-f087-4f00-835f-ad8b7bf38189","handle":"qa-7ec0f5fa4ea8","displayName":"QA 7ec0f5fa4ea8","region":"eu","role":"user","createdAt":"2026-11-18T10:19:53.437782079Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-13d7f5f2-990a-49be-9beb-318cd15c9845

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13d7f5f2-990a-49be-9beb-318cd15c9845
Content-Type: application/json

--- request body ---
{"handle":"qa-7ec0f5fa4ea8","password":"****"}

--- response: 200 in 8 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-13d7f5f2-990a-49be-9beb-318cd15c9845
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 273
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c0ca5d62-f087-4f00-835f-ad8b7bf38189"}
```

## 3. POST /v1/conversations/{id}/close

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/close
correlation: qa-4c1a3eb5-35e0-404a-bb59-4f8254afe5c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c1a3eb5-35e0-404a-bb59-4f8254afe5c1
Content-Type: application/json

--- response: 404 in 9 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4c1a3eb5-35e0-404a-bb59-4f8254afe5c1
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/close","correlationId":"qa-4c1a3eb5-35e0-404a-bb59-4f8254afe5c1"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-230c97c7-34b1-4dc8-9c16-294043135c7b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-230c97c7-34b1-4dc8-9c16-294043135c7b
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-230c97c7-34b1-4dc8-9c16-294043135c7b
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
correlation: qa-aa44fa59-4634-456d-bf8e-a180ee83d6f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa44fa59-4634-456d-bf8e-a180ee83d6f3
Content-Type: application/json

--- request body ---
{"handle":"qa-7ec0f5fa4ea8","password":"****"}

--- response: 401 in 3 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-aa44fa59-4634-456d-bf8e-a180ee83d6f3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 271
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-aa44fa59-4634-456d-bf8e-a180ee83d6f3"}
```
