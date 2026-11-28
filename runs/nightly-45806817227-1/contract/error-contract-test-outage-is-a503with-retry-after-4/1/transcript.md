# Transcript: Every operation answers an outage with a 503 problem and Retry-After [DELETE /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[4]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 73 | `qa-8545e378-e705-47a1-83ed-0da59afa58c3` |
| 2 | `POST /v1/accounts` | 201 | 84 | `qa-330b0b8d-430f-4cde-bff4-ce02398b98a7` |
| 3 | `POST /v1/auth/token` | 200 | 36 | `qa-d4dcad7d-c19a-4aae-96c0-7dbc0ea47366` |
| 4 | `POST /v1/conversations` | 201 | 21 | `qa-6460e0a2-e415-4f36-af2e-b19ff554e78b` |
| 5 | `DELETE /v1/accounts/me` | 503 | 22 | `qa-78a56814-da4c-45c2-b506-9665da0e362f` |
| 6 | `POST /v1/auth/token` | 200 | 28 | `qa-4b0fc8d7-09d7-4abd-b72d-cebf95fa16e3` |
| 7 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-d68f2cf4-41f1-4dea-8418-659ac19bb1f5` |
| 8 | `POST /v1/auth/token` | 401 | 20 | `qa-9ae56a5e-f9b3-49e6-90e8-2b92d6be874e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-36b27c2d-962a-45bd-a4cf-32278981a41c` |
| 10 | `POST /v1/auth/token` | 401 | 21 | `qa-67061aae-a4b8-4d00-accf-9fab22613e53` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8545e378-e705-47a1-83ed-0da59afa58c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8545e378-e705-47a1-83ed-0da59afa58c3
Content-Type: application/json

--- request body ---
{"handle":"qa-a6b8ff5559c8","displayName":"QA a6b8ff5559c8","password":"****","region":"eu"}

--- response: 201 in 73 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-8545e378-e705-47a1-83ed-0da59afa58c3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 478
RateLimit-Reset: 8
Location: /v1/accounts/qa-a6b8ff5559c8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_59d60c79-2acd-4ea6-a478-90aeec328c22","handle":"qa-a6b8ff5559c8","displayName":"QA a6b8ff5559c8","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.195432828Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-330b0b8d-430f-4cde-bff4-ce02398b98a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-330b0b8d-430f-4cde-bff4-ce02398b98a7
Content-Type: application/json

--- request body ---
{"handle":"qa-f0ba773c2b53","displayName":"QA f0ba773c2b53","password":"****","region":"eu"}

--- response: 201 in 84 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-330b0b8d-430f-4cde-bff4-ce02398b98a7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 463
RateLimit-Reset: 8
Location: /v1/accounts/qa-f0ba773c2b53
X-Served-Region: eu
Content-Length: 181

{"id":"acc_75ad8c80-f156-420e-811d-08d295fd89b5","handle":"qa-f0ba773c2b53","displayName":"QA f0ba773c2b53","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.320319785Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d4dcad7d-c19a-4aae-96c0-7dbc0ea47366

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4dcad7d-c19a-4aae-96c0-7dbc0ea47366
Content-Type: application/json

--- request body ---
{"handle":"qa-a6b8ff5559c8","password":"****"}

--- response: 200 in 36 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-d4dcad7d-c19a-4aae-96c0-7dbc0ea47366
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 457
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_59d60c79-2acd-4ea6-a478-90aeec328c22"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-6460e0a2-e415-4f36-af2e-b19ff554e78b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6460e0a2-e415-4f36-af2e-b19ff554e78b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f0ba773c2b53","subject":"Error contract","message":"Hi"}

--- response: 201 in 21 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-6460e0a2-e415-4f36-af2e-b19ff554e78b
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
Location: /v1/conversations/cnv_e94a6a35-0318-41be-906e-e6f27058b3ab
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e94a6a35-0318-41be-906e-e6f27058b3ab","subject":"Error contract","status":"open","region":"eu","participants":["qa-a6b8ff5559c8","qa-f0ba773c2b53"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-26T11:02:45.418160464Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-78a56814-da4c-45c2-b506-9665da0e362f

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: ea8b3fe7-85b8-4520-a166-e2e80e71f789
X-Correlation-Id: qa-78a56814-da4c-45c2-b506-9665da0e362f
Content-Type: application/json

--- response: 503 in 22 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-78a56814-da4c-45c2-b506-9665da0e362f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-78a56814-da4c-45c2-b506-9665da0e362f"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-4b0fc8d7-09d7-4abd-b72d-cebf95fa16e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b0fc8d7-09d7-4abd-b72d-cebf95fa16e3
Content-Type: application/json

--- request body ---
{"handle":"qa-f0ba773c2b53","password":"****"}

--- response: 200 in 28 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-4b0fc8d7-09d7-4abd-b72d-cebf95fa16e3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 443
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_75ad8c80-f156-420e-811d-08d295fd89b5"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d68f2cf4-41f1-4dea-8418-659ac19bb1f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d68f2cf4-41f1-4dea-8418-659ac19bb1f5
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d68f2cf4-41f1-4dea-8418-659ac19bb1f5
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
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-9ae56a5e-f9b3-49e6-90e8-2b92d6be874e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ae56a5e-f9b3-49e6-90e8-2b92d6be874e
Content-Type: application/json

--- request body ---
{"handle":"qa-f0ba773c2b53","password":"****"}

--- response: 401 in 20 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9ae56a5e-f9b3-49e6-90e8-2b92d6be874e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 435
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9ae56a5e-f9b3-49e6-90e8-2b92d6be874e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-36b27c2d-962a-45bd-a4cf-32278981a41c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-36b27c2d-962a-45bd-a4cf-32278981a41c
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-36b27c2d-962a-45bd-a4cf-32278981a41c
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-67061aae-a4b8-4d00-accf-9fab22613e53

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67061aae-a4b8-4d00-accf-9fab22613e53
Content-Type: application/json

--- request body ---
{"handle":"qa-a6b8ff5559c8","password":"****"}

--- response: 401 in 21 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-67061aae-a4b8-4d00-accf-9fab22613e53
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 424
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-67061aae-a4b8-4d00-accf-9fab22613e53"}
```
