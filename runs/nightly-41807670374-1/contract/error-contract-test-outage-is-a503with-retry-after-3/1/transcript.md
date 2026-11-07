# Transcript: Every operation answers an outage with a 503 problem and Retry-After [PATCH /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[3]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 417 | `qa-629d7a99-3fae-4fe3-a9ed-e04c346644b6` |
| 2 | `POST /v1/accounts` | 201 | 38 | `qa-538cad95-b3ad-44e6-ac51-f2056465edfa` |
| 3 | `POST /v1/auth/token` | 200 | 53 | `qa-1e51cd3d-2edc-4375-8546-eaf905e19b48` |
| 4 | `POST /v1/conversations` | 201 | 56 | `qa-e923dc39-dc12-4546-9c4c-4f5a1a2f405c` |
| 5 | `PATCH /v1/accounts/me` | 503 | 26 | `qa-1b522d08-7a3e-42c4-bc08-b0da151e75bf` |
| 6 | `POST /v1/auth/token` | 200 | 25 | `qa-ed2bc095-443d-4b2c-9c7d-4ac4f91295f7` |
| 7 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-6bc148a2-3e07-4875-978f-71f58ad01d30` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-ad1c8c7f-4a30-4389-ac75-79b163cc3fa2` |
| 9 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-8f5ce227-7010-4288-893f-c63d1cc0e2d6` |
| 10 | `POST /v1/auth/token` | 401 | 7 | `qa-e1a4c746-7c8d-4082-930b-a6bc81966fa6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-629d7a99-3fae-4fe3-a9ed-e04c346644b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-629d7a99-3fae-4fe3-a9ed-e04c346644b6
Content-Type: application/json

--- request body ---
{"handle":"qa-f4429697f5bb","displayName":"QA f4429697f5bb","password":"****","region":"eu"}

--- response: 201 in 417 ms ---
Date: Wed, 04 Nov 2026 09:28:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-629d7a99-3fae-4fe3-a9ed-e04c346644b6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 10
Location: /v1/accounts/qa-f4429697f5bb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72778c8b-d7a0-45d1-bf16-ccdbd49ba037","handle":"qa-f4429697f5bb","displayName":"QA f4429697f5bb","region":"eu","role":"user","createdAt":"2026-11-04T09:28:01.020022239Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-538cad95-b3ad-44e6-ac51-f2056465edfa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-538cad95-b3ad-44e6-ac51-f2056465edfa
Content-Type: application/json

--- request body ---
{"handle":"qa-b722fa28eb04","displayName":"QA b722fa28eb04","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Wed, 04 Nov 2026 09:28:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-538cad95-b3ad-44e6-ac51-f2056465edfa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 10
Location: /v1/accounts/qa-b722fa28eb04
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5042dcdf-3644-4f28-b41e-adfb39a0c251","handle":"qa-b722fa28eb04","displayName":"QA b722fa28eb04","region":"eu","role":"user","createdAt":"2026-11-04T09:28:01.374795026Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-1e51cd3d-2edc-4375-8546-eaf905e19b48

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e51cd3d-2edc-4375-8546-eaf905e19b48
Content-Type: application/json

--- request body ---
{"handle":"qa-f4429697f5bb","password":"****"}

--- response: 200 in 53 ms ---
Date: Wed, 04 Nov 2026 09:28:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e51cd3d-2edc-4375-8546-eaf905e19b48
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 563
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_72778c8b-d7a0-45d1-bf16-ccdbd49ba037"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-e923dc39-dc12-4546-9c4c-4f5a1a2f405c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e923dc39-dc12-4546-9c4c-4f5a1a2f405c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b722fa28eb04","subject":"Error contract","message":"Hi"}

--- response: 201 in 56 ms ---
Date: Wed, 04 Nov 2026 09:28:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-e923dc39-dc12-4546-9c4c-4f5a1a2f405c
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
Location: /v1/conversations/cnv_4201117d-2a60-4b51-ac34-c1a5994bdf69
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_4201117d-2a60-4b51-ac34-c1a5994bdf69","subject":"Error contract","status":"open","region":"eu","participants":["qa-f4429697f5bb","qa-b722fa28eb04"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-04T09:28:01.525805887Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-1b522d08-7a3e-42c4-bc08-b0da151e75bf

--- request headers ---
Accept: application/json
X-Fault-Key: d6b3b88c-5039-4170-ba29-1f72d8aefc86
X-Fault: unavailable-once
X-Correlation-Id: qa-1b522d08-7a3e-42c4-bc08-b0da151e75bf
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 503 in 26 ms ---
Date: Wed, 04 Nov 2026 09:28:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1b522d08-7a3e-42c4-bc08-b0da151e75bf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-1b522d08-7a3e-42c4-bc08-b0da151e75bf"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ed2bc095-443d-4b2c-9c7d-4ac4f91295f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed2bc095-443d-4b2c-9c7d-4ac4f91295f7
Content-Type: application/json

--- request body ---
{"handle":"qa-b722fa28eb04","password":"****"}

--- response: 200 in 25 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-ed2bc095-443d-4b2c-9c7d-4ac4f91295f7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 545
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5042dcdf-3644-4f28-b41e-adfb39a0c251"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6bc148a2-3e07-4875-978f-71f58ad01d30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6bc148a2-3e07-4875-978f-71f58ad01d30
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6bc148a2-3e07-4875-978f-71f58ad01d30
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
correlation: qa-ad1c8c7f-4a30-4389-ac75-79b163cc3fa2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad1c8c7f-4a30-4389-ac75-79b163cc3fa2
Content-Type: application/json

--- request body ---
{"handle":"qa-b722fa28eb04","password":"****"}

--- response: 401 in 14 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ad1c8c7f-4a30-4389-ac75-79b163cc3fa2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 532
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ad1c8c7f-4a30-4389-ac75-79b163cc3fa2"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8f5ce227-7010-4288-893f-c63d1cc0e2d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f5ce227-7010-4288-893f-c63d1cc0e2d6
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8f5ce227-7010-4288-893f-c63d1cc0e2d6
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
correlation: qa-e1a4c746-7c8d-4082-930b-a6bc81966fa6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1a4c746-7c8d-4082-930b-a6bc81966fa6
Content-Type: application/json

--- request body ---
{"handle":"qa-f4429697f5bb","password":"****"}

--- response: 401 in 7 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e1a4c746-7c8d-4082-930b-a6bc81966fa6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 521
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e1a4c746-7c8d-4082-930b-a6bc81966fa6"}
```
