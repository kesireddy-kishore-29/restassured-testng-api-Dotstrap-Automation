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
| 1 | `POST /v1/accounts` | 201 | 15 | `qa-f1facc74-499a-4ed8-a443-0fcee701a5f5` |
| 2 | `POST /v1/auth/token` | 200 | 6 | `qa-b3a40f68-759e-4d84-a09a-4d8a9267ed04` |
| 3 | `POST /v1/conversations/{id}/close` | 404 | 5 | `qa-85227ab7-01fe-447c-b35f-720afc671e48` |
| 4 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-9af799f6-0caa-409b-8224-e09c896336b7` |
| 5 | `POST /v1/auth/token` | 401 | 3 | `qa-c17c47ef-dc13-41cc-818f-0894e8a35dcc` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f1facc74-499a-4ed8-a443-0fcee701a5f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1facc74-499a-4ed8-a443-0fcee701a5f5
Content-Type: application/json

--- request body ---
{"handle":"qa-5d5061302ca1","displayName":"QA 5d5061302ca1","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-f1facc74-499a-4ed8-a443-0fcee701a5f5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 278
RateLimit-Reset: 7
Location: /v1/accounts/qa-5d5061302ca1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a404ff29-7780-4b10-b28a-bcfbba8e7347","handle":"qa-5d5061302ca1","displayName":"QA 5d5061302ca1","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.955627817Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-b3a40f68-759e-4d84-a09a-4d8a9267ed04

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3a40f68-759e-4d84-a09a-4d8a9267ed04
Content-Type: application/json

--- request body ---
{"handle":"qa-5d5061302ca1","password":"****"}

--- response: 200 in 6 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-b3a40f68-759e-4d84-a09a-4d8a9267ed04
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a404ff29-7780-4b10-b28a-bcfbba8e7347"}
```

## 3. POST /v1/conversations/{id}/close

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/close
correlation: qa-85227ab7-01fe-447c-b35f-720afc671e48

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85227ab7-01fe-447c-b35f-720afc671e48
Content-Type: application/json

--- response: 404 in 5 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-85227ab7-01fe-447c-b35f-720afc671e48
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/close","correlationId":"qa-85227ab7-01fe-447c-b35f-720afc671e48"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9af799f6-0caa-409b-8224-e09c896336b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9af799f6-0caa-409b-8224-e09c896336b7
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9af799f6-0caa-409b-8224-e09c896336b7
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
correlation: qa-c17c47ef-dc13-41cc-818f-0894e8a35dcc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c17c47ef-dc13-41cc-818f-0894e8a35dcc
Content-Type: application/json

--- request body ---
{"handle":"qa-5d5061302ca1","password":"****"}

--- response: 401 in 3 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c17c47ef-dc13-41cc-818f-0894e8a35dcc
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c17c47ef-dc13-41cc-818f-0894e8a35dcc"}
```
