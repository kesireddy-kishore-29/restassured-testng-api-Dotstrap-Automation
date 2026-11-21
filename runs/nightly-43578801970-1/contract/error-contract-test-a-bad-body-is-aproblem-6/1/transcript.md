# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[6]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 32 | `qa-29b3d225-a07f-42fd-bf2b-3312bbffad08` |
| 2 | `POST /v1/accounts` | 201 | 47 | `qa-33f60cc0-34c6-4db7-b9d0-d5f132d60ca8` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-2dc9f7be-7b71-4df7-83c2-a82499cc914b` |
| 4 | `POST /v1/conversations` | 201 | 13 | `qa-8863091d-b210-417c-8a47-1a34b0c86cc8` |
| 5 | `PATCH /v1/accounts/me` | 400 | 24 | `qa-60735b71-4e9c-4ac5-a51b-4e66bfd83d31` |
| 6 | `POST /v1/auth/token` | 200 | 35 | `qa-8c826838-d761-411c-9076-200b5e0982c3` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-4d375199-d1bb-41aa-b48d-c9ccb2aba72d` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-d2e16ec7-180d-4f1b-82d9-689d28cab0c5` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-f2003a9f-4ff2-4e3d-9e66-f71437cc8583` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-ddda7e3a-ceb6-4ee6-9981-476e84949414` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-29b3d225-a07f-42fd-bf2b-3312bbffad08

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29b3d225-a07f-42fd-bf2b-3312bbffad08
Content-Type: application/json

--- request body ---
{"handle":"qa-eb3aa98f2bbc","displayName":"QA eb3aa98f2bbc","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-29b3d225-a07f-42fd-bf2b-3312bbffad08
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 473
RateLimit-Reset: 8
Location: /v1/accounts/qa-eb3aa98f2bbc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d0140917-b2f7-41b5-9834-a63418c29c5b","handle":"qa-eb3aa98f2bbc","displayName":"QA eb3aa98f2bbc","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.399461373Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-33f60cc0-34c6-4db7-b9d0-d5f132d60ca8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33f60cc0-34c6-4db7-b9d0-d5f132d60ca8
Content-Type: application/json

--- request body ---
{"handle":"qa-e61b9d137111","displayName":"QA e61b9d137111","password":"****","region":"eu"}

--- response: 201 in 47 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-33f60cc0-34c6-4db7-b9d0-d5f132d60ca8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 467
RateLimit-Reset: 8
Location: /v1/accounts/qa-e61b9d137111
X-Served-Region: eu
Content-Length: 181

{"id":"acc_60a6a357-4dd6-4387-9a40-18c889942d2c","handle":"qa-e61b9d137111","displayName":"QA e61b9d137111","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.452392222Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-2dc9f7be-7b71-4df7-83c2-a82499cc914b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2dc9f7be-7b71-4df7-83c2-a82499cc914b
Content-Type: application/json

--- request body ---
{"handle":"qa-eb3aa98f2bbc","password":"****"}

--- response: 200 in 25 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-2dc9f7be-7b71-4df7-83c2-a82499cc914b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 459
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d0140917-b2f7-41b5-9834-a63418c29c5b"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-8863091d-b210-417c-8a47-1a34b0c86cc8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8863091d-b210-417c-8a47-1a34b0c86cc8
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e61b9d137111","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-8863091d-b210-417c-8a47-1a34b0c86cc8
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
Location: /v1/conversations/cnv_c4881e35-711b-4b65-8fed-1a4ca33b12d6
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_c4881e35-711b-4b65-8fed-1a4ca33b12d6","subject":"Error contract","status":"open","region":"eu","participants":["qa-eb3aa98f2bbc","qa-e61b9d137111"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-14T09:05:11.525927099Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-60735b71-4e9c-4ac5-a51b-4e66bfd83d31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60735b71-4e9c-4ac5-a51b-4e66bfd83d31
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 24 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-60735b71-4e9c-4ac5-a51b-4e66bfd83d31
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
Content-Length: 256

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts/me","correlationId":"qa-60735b71-4e9c-4ac5-a51b-4e66bfd83d31"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-8c826838-d761-411c-9076-200b5e0982c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c826838-d761-411c-9076-200b5e0982c3
Content-Type: application/json

--- request body ---
{"handle":"qa-e61b9d137111","password":"****"}

--- response: 200 in 35 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c826838-d761-411c-9076-200b5e0982c3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 441
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_60a6a357-4dd6-4387-9a40-18c889942d2c"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4d375199-d1bb-41aa-b48d-c9ccb2aba72d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d375199-d1bb-41aa-b48d-c9ccb2aba72d
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4d375199-d1bb-41aa-b48d-c9ccb2aba72d
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
correlation: qa-d2e16ec7-180d-4f1b-82d9-689d28cab0c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2e16ec7-180d-4f1b-82d9-689d28cab0c5
Content-Type: application/json

--- request body ---
{"handle":"qa-e61b9d137111","password":"****"}

--- response: 401 in 12 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d2e16ec7-180d-4f1b-82d9-689d28cab0c5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 435
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d2e16ec7-180d-4f1b-82d9-689d28cab0c5"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f2003a9f-4ff2-4e3d-9e66-f71437cc8583

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2003a9f-4ff2-4e3d-9e66-f71437cc8583
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f2003a9f-4ff2-4e3d-9e66-f71437cc8583
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-ddda7e3a-ceb6-4ee6-9981-476e84949414

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ddda7e3a-ceb6-4ee6-9981-476e84949414
Content-Type: application/json

--- request body ---
{"handle":"qa-eb3aa98f2bbc","password":"****"}

--- response: 401 in 15 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ddda7e3a-ceb6-4ee6-9981-476e84949414
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 427
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ddda7e3a-ceb6-4ee6-9981-476e84949414"}
```
