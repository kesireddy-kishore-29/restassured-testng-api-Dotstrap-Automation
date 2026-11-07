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
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-9fc8922b-b5ae-4ff3-b8df-0d9c506c527d` |
| 2 | `POST /v1/accounts` | 201 | 17 | `qa-44a76d7b-61c5-444b-8942-03e76c291657` |
| 3 | `POST /v1/auth/token` | 200 | 29 | `qa-50473f57-ad3a-42c5-a234-839fb47d1514` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-1c96cce5-c5c9-40ef-8f2c-ebd8de25cd75` |
| 5 | `POST /v1/credits/purchases` | 503 | 19 | `qa-f5f5e667-bcf3-4acb-9437-e62e983dd58b` |
| 6 | `POST /v1/auth/token` | 200 | 33 | `qa-e0db55f1-d103-4f54-9b7b-19091ea53674` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-58897b3e-fc24-419b-82e9-76a05490d3c5` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-54090566-0b65-495c-b82a-3781218bf38c` |
| 9 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-e42319fc-751c-423a-b542-53bc6eda6ad0` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-b6c242a6-581f-45da-a693-db7ddae8eb08` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9fc8922b-b5ae-4ff3-b8df-0d9c506c527d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9fc8922b-b5ae-4ff3-b8df-0d9c506c527d
Content-Type: application/json

--- request body ---
{"handle":"qa-8ab576d928b6","displayName":"QA 8ab576d928b6","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-9fc8922b-b5ae-4ff3-b8df-0d9c506c527d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 363
RateLimit-Reset: 8
Location: /v1/accounts/qa-8ab576d928b6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f7077f4a-0a31-47af-9c9a-4a9e83b4716b","handle":"qa-8ab576d928b6","displayName":"QA 8ab576d928b6","region":"eu","role":"user","createdAt":"2026-11-04T09:28:03.287794914Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-44a76d7b-61c5-444b-8942-03e76c291657

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44a76d7b-61c5-444b-8942-03e76c291657
Content-Type: application/json

--- request body ---
{"handle":"qa-f9336501d869","displayName":"QA f9336501d869","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-44a76d7b-61c5-444b-8942-03e76c291657
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 360
RateLimit-Reset: 8
Location: /v1/accounts/qa-f9336501d869
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8efd79b8-a01e-493b-b9dd-e8bb02a0ce1e","handle":"qa-f9336501d869","displayName":"QA f9336501d869","region":"eu","role":"user","createdAt":"2026-11-04T09:28:03.312835664Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-50473f57-ad3a-42c5-a234-839fb47d1514

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50473f57-ad3a-42c5-a234-839fb47d1514
Content-Type: application/json

--- request body ---
{"handle":"qa-8ab576d928b6","password":"****"}

--- response: 200 in 29 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-50473f57-ad3a-42c5-a234-839fb47d1514
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 355
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f7077f4a-0a31-47af-9c9a-4a9e83b4716b"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-1c96cce5-c5c9-40ef-8f2c-ebd8de25cd75

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c96cce5-c5c9-40ef-8f2c-ebd8de25cd75
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f9336501d869","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-1c96cce5-c5c9-40ef-8f2c-ebd8de25cd75
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
Location: /v1/conversations/cnv_5401cb67-7057-4509-919d-53b55cbc439a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_5401cb67-7057-4509-919d-53b55cbc439a","subject":"Error contract","status":"open","region":"eu","participants":["qa-8ab576d928b6","qa-f9336501d869"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-04T09:28:03.368092904Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-f5f5e667-bcf3-4acb-9437-e62e983dd58b

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
Idempotency-Key: qa-6587e5d3821d4a7ca8d777a4d09155d4
X-Fault-Key: f2e7c34e-32a3-4e99-a933-0ae3e3209831
X-Correlation-Id: qa-f5f5e667-bcf3-4acb-9437-e62e983dd58b
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 19 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f5f5e667-bcf3-4acb-9437-e62e983dd58b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 265

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/purchases","correlationId":"qa-f5f5e667-bcf3-4acb-9437-e62e983dd58b"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e0db55f1-d103-4f54-9b7b-19091ea53674

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0db55f1-d103-4f54-9b7b-19091ea53674
Content-Type: application/json

--- request body ---
{"handle":"qa-f9336501d869","password":"****"}

--- response: 200 in 33 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-e0db55f1-d103-4f54-9b7b-19091ea53674
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 334
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8efd79b8-a01e-493b-b9dd-e8bb02a0ce1e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-58897b3e-fc24-419b-82e9-76a05490d3c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58897b3e-fc24-419b-82e9-76a05490d3c5
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-58897b3e-fc24-419b-82e9-76a05490d3c5
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
correlation: qa-54090566-0b65-495c-b82a-3781218bf38c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54090566-0b65-495c-b82a-3781218bf38c
Content-Type: application/json

--- request body ---
{"handle":"qa-f9336501d869","password":"****"}

--- response: 401 in 13 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-54090566-0b65-495c-b82a-3781218bf38c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 328
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-54090566-0b65-495c-b82a-3781218bf38c"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e42319fc-751c-423a-b542-53bc6eda6ad0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e42319fc-751c-423a-b542-53bc6eda6ad0
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e42319fc-751c-423a-b542-53bc6eda6ad0
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
correlation: qa-b6c242a6-581f-45da-a693-db7ddae8eb08

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b6c242a6-581f-45da-a693-db7ddae8eb08
Content-Type: application/json

--- request body ---
{"handle":"qa-8ab576d928b6","password":"****"}

--- response: 401 in 10 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b6c242a6-581f-45da-a693-db7ddae8eb08
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 327
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b6c242a6-581f-45da-a693-db7ddae8eb08"}
```
