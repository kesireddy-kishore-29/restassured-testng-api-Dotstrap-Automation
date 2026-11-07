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
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-522d32f0-fcc7-4a96-88c6-6077254bc5dd` |
| 2 | `POST /v1/auth/token` | 200 | 15 | `qa-6d1d05a0-3556-4b67-8215-caad259ad2a3` |
| 3 | `GET /v1/conversations/{id}/messages` | 404 | 9 | `qa-a47631ee-6ba7-4141-b9e4-3ab7fcc7f622` |
| 4 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-c97c54c0-4d55-481a-8adf-1ecb090ef101` |
| 5 | `POST /v1/auth/token` | 401 | 8 | `qa-95c71c7d-def0-454a-a150-f73b4b035a1f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-522d32f0-fcc7-4a96-88c6-6077254bc5dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-522d32f0-fcc7-4a96-88c6-6077254bc5dd
Content-Type: application/json

--- request body ---
{"handle":"qa-1f1850fe5082","displayName":"QA 1f1850fe5082","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-522d32f0-fcc7-4a96-88c6-6077254bc5dd
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
Location: /v1/accounts/qa-1f1850fe5082
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6aa59289-e3c1-4da1-811c-244e9aa67702","handle":"qa-1f1850fe5082","displayName":"QA 1f1850fe5082","region":"eu","role":"user","createdAt":"2026-11-05T09:37:57.482017496Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-6d1d05a0-3556-4b67-8215-caad259ad2a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d1d05a0-3556-4b67-8215-caad259ad2a3
Content-Type: application/json

--- request body ---
{"handle":"qa-1f1850fe5082","password":"****"}

--- response: 200 in 15 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-6d1d05a0-3556-4b67-8215-caad259ad2a3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 284
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6aa59289-e3c1-4da1-811c-244e9aa67702"}
```

## 3. GET /v1/conversations/{id}/messages

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-a47631ee-6ba7-4141-b9e4-3ab7fcc7f622

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a47631ee-6ba7-4141-b9e4-3ab7fcc7f622
Content-Type: application/json

--- response: 404 in 9 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a47631ee-6ba7-4141-b9e4-3ab7fcc7f622
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-a47631ee-6ba7-4141-b9e4-3ab7fcc7f622"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c97c54c0-4d55-481a-8adf-1ecb090ef101

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c97c54c0-4d55-481a-8adf-1ecb090ef101
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c97c54c0-4d55-481a-8adf-1ecb090ef101
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
correlation: qa-95c71c7d-def0-454a-a150-f73b4b035a1f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95c71c7d-def0-454a-a150-f73b4b035a1f
Content-Type: application/json

--- request body ---
{"handle":"qa-1f1850fe5082","password":"****"}

--- response: 401 in 8 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-95c71c7d-def0-454a-a150-f73b4b035a1f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 278
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-95c71c7d-def0-454a-a150-f73b4b035a1f"}
```
