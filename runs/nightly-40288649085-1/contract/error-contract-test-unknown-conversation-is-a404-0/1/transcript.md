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
| 1 | `POST /v1/accounts` | 201 | 14 | `qa-5a93be28-befb-4f49-94f2-59f0dff2c63f` |
| 2 | `POST /v1/auth/token` | 200 | 12 | `qa-d3cfcfb8-ae80-4c31-b971-d37f692615c9` |
| 3 | `GET /v1/conversations/{id}` | 404 | 14 | `qa-f3dd3284-57e6-4023-b1a1-6489a86c5000` |
| 4 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-badc1e38-f460-4505-a0fa-7bacea095b4e` |
| 5 | `POST /v1/auth/token` | 401 | 10 | `qa-4d7cdba8-103e-4584-8746-b57bddc8d37b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5a93be28-befb-4f49-94f2-59f0dff2c63f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a93be28-befb-4f49-94f2-59f0dff2c63f
Content-Type: application/json

--- request body ---
{"handle":"qa-88717d927566","displayName":"QA 88717d927566","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-5a93be28-befb-4f49-94f2-59f0dff2c63f
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
Location: /v1/accounts/qa-88717d927566
X-Served-Region: eu
Content-Length: 181

{"id":"acc_471866ee-e049-47e5-822f-8f014e19c17c","handle":"qa-88717d927566","displayName":"QA 88717d927566","region":"eu","role":"user","createdAt":"2026-10-26T07:54:49.117001576Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-d3cfcfb8-ae80-4c31-b971-d37f692615c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3cfcfb8-ae80-4c31-b971-d37f692615c9
Content-Type: application/json

--- request body ---
{"handle":"qa-88717d927566","password":"****"}

--- response: 200 in 12 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-d3cfcfb8-ae80-4c31-b971-d37f692615c9
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_471866ee-e049-47e5-822f-8f014e19c17c"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-f3dd3284-57e6-4023-b1a1-6489a86c5000

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3dd3284-57e6-4023-b1a1-6489a86c5000
Content-Type: application/json

--- response: 404 in 14 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f3dd3284-57e6-4023-b1a1-6489a86c5000
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-f3dd3284-57e6-4023-b1a1-6489a86c5000"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-badc1e38-f460-4505-a0fa-7bacea095b4e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-badc1e38-f460-4505-a0fa-7bacea095b4e
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: text/plain
X-Correlation-Id: qa-badc1e38-f460-4505-a0fa-7bacea095b4e
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
correlation: qa-4d7cdba8-103e-4584-8746-b57bddc8d37b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d7cdba8-103e-4584-8746-b57bddc8d37b
Content-Type: application/json

--- request body ---
{"handle":"qa-88717d927566","password":"****"}

--- response: 401 in 10 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4d7cdba8-103e-4584-8746-b57bddc8d37b
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4d7cdba8-103e-4584-8746-b57bddc8d37b"}
```
