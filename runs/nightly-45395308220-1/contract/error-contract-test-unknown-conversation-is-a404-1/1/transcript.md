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
| 1 | `POST /v1/accounts` | 201 | 6 | `qa-b3e2407c-d8a6-48eb-a997-d20683092f9d` |
| 2 | `POST /v1/auth/token` | 200 | 21 | `qa-bdefd2f7-70fb-4b4f-a1f8-88f85869e0e4` |
| 3 | `GET /v1/conversations/{id}/messages` | 404 | 8 | `qa-d6e4d4dc-5e69-4778-a8b8-ee82b8e15799` |
| 4 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-3f01294e-ff53-4ea8-b641-be4ec17bad24` |
| 5 | `POST /v1/auth/token` | 401 | 10 | `qa-f136834b-84d3-43e4-a7ba-9e50923657cb` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b3e2407c-d8a6-48eb-a997-d20683092f9d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3e2407c-d8a6-48eb-a997-d20683092f9d
Content-Type: application/json

--- request body ---
{"handle":"qa-390bfa18f69a","displayName":"QA 390bfa18f69a","password":"****","region":"eu"}

--- response: 201 in 6 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-b3e2407c-d8a6-48eb-a997-d20683092f9d
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
Location: /v1/accounts/qa-390bfa18f69a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4ef4e18b-39ac-4421-9d32-ea0e2b9aa053","handle":"qa-390bfa18f69a","displayName":"QA 390bfa18f69a","region":"eu","role":"user","createdAt":"2026-11-24T12:38:16.113951667Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-bdefd2f7-70fb-4b4f-a1f8-88f85869e0e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bdefd2f7-70fb-4b4f-a1f8-88f85869e0e4
Content-Type: application/json

--- request body ---
{"handle":"qa-390bfa18f69a","password":"****"}

--- response: 200 in 21 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-bdefd2f7-70fb-4b4f-a1f8-88f85869e0e4
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4ef4e18b-39ac-4421-9d32-ea0e2b9aa053"}
```

## 3. GET /v1/conversations/{id}/messages

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-d6e4d4dc-5e69-4778-a8b8-ee82b8e15799

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6e4d4dc-5e69-4778-a8b8-ee82b8e15799
Content-Type: application/json

--- response: 404 in 8 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d6e4d4dc-5e69-4778-a8b8-ee82b8e15799
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-d6e4d4dc-5e69-4778-a8b8-ee82b8e15799"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3f01294e-ff53-4ea8-b641-be4ec17bad24

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f01294e-ff53-4ea8-b641-be4ec17bad24
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3f01294e-ff53-4ea8-b641-be4ec17bad24
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
correlation: qa-f136834b-84d3-43e4-a7ba-9e50923657cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f136834b-84d3-43e4-a7ba-9e50923657cb
Content-Type: application/json

--- request body ---
{"handle":"qa-390bfa18f69a","password":"****"}

--- response: 401 in 10 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f136834b-84d3-43e4-a7ba-9e50923657cb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 277
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f136834b-84d3-43e4-a7ba-9e50923657cb"}
```
