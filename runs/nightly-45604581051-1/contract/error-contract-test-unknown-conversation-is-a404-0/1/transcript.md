# Transcript: Every conversation operation answers an unknown id with a 404 problem [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[0]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-48424dfe-e3ec-4b18-a395-be77334b56b4` |
| 2 | `POST /v1/auth/token` | 200 | 16 | `qa-134f52a2-9fa2-4ede-b84c-91473686ff66` |
| 3 | `GET /v1/conversations/{id}` | 404 | 18 | `qa-a00def55-01c5-4a4c-a0b0-24b5e4520423` |
| 4 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-ae6131f7-d9ed-4a34-9347-2f729d4d7fc9` |
| 5 | `POST /v1/auth/token` | 401 | 12 | `qa-17740f74-2a3b-4868-a625-1509a79fb292` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-48424dfe-e3ec-4b18-a395-be77334b56b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48424dfe-e3ec-4b18-a395-be77334b56b4
Content-Type: application/json

--- request body ---
{"handle":"qa-273b5216950f","displayName":"QA 273b5216950f","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-48424dfe-e3ec-4b18-a395-be77334b56b4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 287
RateLimit-Reset: 7
Location: /v1/accounts/qa-273b5216950f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cfafc98b-4dab-4dc6-9c83-49b36e80340c","handle":"qa-273b5216950f","displayName":"QA 273b5216950f","region":"eu","role":"user","createdAt":"2026-11-25T11:27:59.844404165Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-134f52a2-9fa2-4ede-b84c-91473686ff66

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-134f52a2-9fa2-4ede-b84c-91473686ff66
Content-Type: application/json

--- request body ---
{"handle":"qa-273b5216950f","password":"****"}

--- response: 200 in 16 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-134f52a2-9fa2-4ede-b84c-91473686ff66
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 280
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cfafc98b-4dab-4dc6-9c83-49b36e80340c"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-a00def55-01c5-4a4c-a0b0-24b5e4520423

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a00def55-01c5-4a4c-a0b0-24b5e4520423
Content-Type: application/json

--- response: 404 in 18 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a00def55-01c5-4a4c-a0b0-24b5e4520423
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
Content-Length: 253

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-a00def55-01c5-4a4c-a0b0-24b5e4520423"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ae6131f7-d9ed-4a34-9347-2f729d4d7fc9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae6131f7-d9ed-4a34-9347-2f729d4d7fc9
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ae6131f7-d9ed-4a34-9347-2f729d4d7fc9
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
correlation: qa-17740f74-2a3b-4868-a625-1509a79fb292

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17740f74-2a3b-4868-a625-1509a79fb292
Content-Type: application/json

--- request body ---
{"handle":"qa-273b5216950f","password":"****"}

--- response: 401 in 12 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-17740f74-2a3b-4868-a625-1509a79fb292
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-17740f74-2a3b-4868-a625-1509a79fb292"}
```
