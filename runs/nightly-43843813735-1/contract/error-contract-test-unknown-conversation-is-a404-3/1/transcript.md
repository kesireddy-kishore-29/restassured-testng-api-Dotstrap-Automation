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
| 1 | `POST /v1/accounts` | 201 | 25 | `qa-be2eed62-ee8f-4116-913f-880189f5aefc` |
| 2 | `POST /v1/auth/token` | 200 | 48 | `qa-8960927f-4875-4463-bdeb-f765934ecfcb` |
| 3 | `POST /v1/conversations/{id}/read` | 404 | 19 | `qa-269124d4-8747-4369-ab88-936172f9410c` |
| 4 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-2edfe1e0-0a02-484a-b9f4-d94baceb428f` |
| 5 | `POST /v1/auth/token` | 401 | 9 | `qa-0132cb28-a433-47e3-a216-9d3b2ef7a439` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-be2eed62-ee8f-4116-913f-880189f5aefc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be2eed62-ee8f-4116-913f-880189f5aefc
Content-Type: application/json

--- request body ---
{"handle":"qa-d740f8d8de96","displayName":"QA d740f8d8de96","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-be2eed62-ee8f-4116-913f-880189f5aefc
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
Location: /v1/accounts/qa-d740f8d8de96
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c530c3fd-81ec-4608-8048-ba05618c23bd","handle":"qa-d740f8d8de96","displayName":"QA d740f8d8de96","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.822952315Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-8960927f-4875-4463-bdeb-f765934ecfcb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8960927f-4875-4463-bdeb-f765934ecfcb
Content-Type: application/json

--- request body ---
{"handle":"qa-d740f8d8de96","password":"****"}

--- response: 200 in 48 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-8960927f-4875-4463-bdeb-f765934ecfcb
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c530c3fd-81ec-4608-8048-ba05618c23bd"}
```

## 3. POST /v1/conversations/{id}/read

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/read
correlation: qa-269124d4-8747-4369-ab88-936172f9410c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-269124d4-8747-4369-ab88-936172f9410c
Content-Type: application/json

--- response: 404 in 19 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-269124d4-8747-4369-ab88-936172f9410c
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/read","correlationId":"qa-269124d4-8747-4369-ab88-936172f9410c"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2edfe1e0-0a02-484a-b9f4-d94baceb428f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2edfe1e0-0a02-484a-b9f4-d94baceb428f
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2edfe1e0-0a02-484a-b9f4-d94baceb428f
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
correlation: qa-0132cb28-a433-47e3-a216-9d3b2ef7a439

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0132cb28-a433-47e3-a216-9d3b2ef7a439
Content-Type: application/json

--- request body ---
{"handle":"qa-d740f8d8de96","password":"****"}

--- response: 401 in 9 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0132cb28-a433-47e3-a216-9d3b2ef7a439
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 276
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0132cb28-a433-47e3-a216-9d3b2ef7a439"}
```
