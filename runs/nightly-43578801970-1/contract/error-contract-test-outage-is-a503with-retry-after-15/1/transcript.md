# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/credits/purchases]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[15]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 45 | `qa-60388218-a3b7-4713-9dd3-22d82d2db406` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-dc8ea764-c5fb-4e08-a805-c485394db46c` |
| 3 | `POST /v1/auth/token` | 200 | 48 | `qa-7f4f443d-a522-46a9-a332-e3bdeb327d38` |
| 4 | `POST /v1/conversations` | 201 | 9 | `qa-3fda5013-814f-486c-bae2-1ff0d63517ae` |
| 5 | `POST /v1/credits/purchases` | 503 | 9 | `qa-947bee18-8e36-4620-99cc-4633931d1b58` |
| 6 | `POST /v1/auth/token` | 200 | 27 | `qa-1643ef0e-e547-40af-8faf-41359dd45992` |
| 7 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-fe05a577-e79a-4253-aaae-6d79af60e7b4` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-bfa531d3-6413-4544-8bf7-673117238aa9` |
| 9 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-5942c667-f5c5-4650-ad73-96372dc757b7` |
| 10 | `POST /v1/auth/token` | 401 | 22 | `qa-22e4a292-308b-4222-9e9b-8123b05ee8a4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-60388218-a3b7-4713-9dd3-22d82d2db406

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60388218-a3b7-4713-9dd3-22d82d2db406
Content-Type: application/json

--- request body ---
{"handle":"qa-e4b5381158df","displayName":"QA e4b5381158df","password":"****","region":"eu"}

--- response: 201 in 45 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-60388218-a3b7-4713-9dd3-22d82d2db406
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 346
RateLimit-Reset: 7
Location: /v1/accounts/qa-e4b5381158df
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f441f739-73de-44e5-b6f6-9887392addbd","handle":"qa-e4b5381158df","displayName":"QA e4b5381158df","region":"eu","role":"user","createdAt":"2026-11-14T09:05:12.473037950Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-dc8ea764-c5fb-4e08-a805-c485394db46c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc8ea764-c5fb-4e08-a805-c485394db46c
Content-Type: application/json

--- request body ---
{"handle":"qa-f1f96b0b2af9","displayName":"QA f1f96b0b2af9","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc8ea764-c5fb-4e08-a805-c485394db46c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 339
RateLimit-Reset: 7
Location: /v1/accounts/qa-f1f96b0b2af9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e030ea30-7243-4eac-bc7f-239e986f31bd","handle":"qa-f1f96b0b2af9","displayName":"QA f1f96b0b2af9","region":"eu","role":"user","createdAt":"2026-11-14T09:05:12.507693524Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-7f4f443d-a522-46a9-a332-e3bdeb327d38

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f4f443d-a522-46a9-a332-e3bdeb327d38
Content-Type: application/json

--- request body ---
{"handle":"qa-e4b5381158df","password":"****"}

--- response: 200 in 48 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-7f4f443d-a522-46a9-a332-e3bdeb327d38
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 336
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f441f739-73de-44e5-b6f6-9887392addbd"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-3fda5013-814f-486c-bae2-1ff0d63517ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3fda5013-814f-486c-bae2-1ff0d63517ae
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f1f96b0b2af9","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-3fda5013-814f-486c-bae2-1ff0d63517ae
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
Location: /v1/conversations/cnv_65e32cd7-2f4c-4a61-9acd-0a636a2dfa24
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_65e32cd7-2f4c-4a61-9acd-0a636a2dfa24","subject":"Error contract","status":"open","region":"eu","participants":["qa-e4b5381158df","qa-f1f96b0b2af9"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-14T09:05:12.586066706Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-947bee18-8e36-4620-99cc-4633931d1b58

--- request headers ---
Accept: application/json
X-Fault-Key: 1f6e043a-d4ae-4fc2-8929-24ff90bacb65
Idempotency-Key: qa-6cb9c679c8314d9fb8276aea61738aa7
X-Fault: unavailable-once
X-Correlation-Id: qa-947bee18-8e36-4620-99cc-4633931d1b58
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 9 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-947bee18-8e36-4620-99cc-4633931d1b58
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 265

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/purchases","correlationId":"qa-947bee18-8e36-4620-99cc-4633931d1b58"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-1643ef0e-e547-40af-8faf-41359dd45992

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1643ef0e-e547-40af-8faf-41359dd45992
Content-Type: application/json

--- request body ---
{"handle":"qa-f1f96b0b2af9","password":"****"}

--- response: 200 in 27 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-1643ef0e-e547-40af-8faf-41359dd45992
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 324
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e030ea30-7243-4eac-bc7f-239e986f31bd"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fe05a577-e79a-4253-aaae-6d79af60e7b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe05a577-e79a-4253-aaae-6d79af60e7b4
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fe05a577-e79a-4253-aaae-6d79af60e7b4
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
correlation: qa-bfa531d3-6413-4544-8bf7-673117238aa9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bfa531d3-6413-4544-8bf7-673117238aa9
Content-Type: application/json

--- request body ---
{"handle":"qa-f1f96b0b2af9","password":"****"}

--- response: 401 in 14 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bfa531d3-6413-4544-8bf7-673117238aa9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 314
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bfa531d3-6413-4544-8bf7-673117238aa9"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5942c667-f5c5-4650-ad73-96372dc757b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5942c667-f5c5-4650-ad73-96372dc757b7
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5942c667-f5c5-4650-ad73-96372dc757b7
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
correlation: qa-22e4a292-308b-4222-9e9b-8123b05ee8a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22e4a292-308b-4222-9e9b-8123b05ee8a4
Content-Type: application/json

--- request body ---
{"handle":"qa-e4b5381158df","password":"****"}

--- response: 401 in 22 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-22e4a292-308b-4222-9e9b-8123b05ee8a4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 306
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-22e4a292-308b-4222-9e9b-8123b05ee8a4"}
```
