# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[6]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 26 | `qa-c2e05b23-a54b-4037-a1a3-6363559959d2` |
| 2 | `POST /v1/accounts` | 201 | 40 | `qa-687c116c-bd3a-42f7-a63a-05fd0ce9fcb1` |
| 3 | `POST /v1/auth/token` | 200 | 35 | `qa-5e36c64f-ecb5-429f-97f4-53e01df462e9` |
| 4 | `POST /v1/conversations` | 201 | 23 | `qa-b9d030b1-f1ac-4f9b-90b6-13554e2c3a72` |
| 5 | `POST /v1/conversations` | 503 | 35 | `qa-4ab51b67-d45f-4918-ae38-b84e01ae4ed3` |
| 6 | `POST /v1/auth/token` | 200 | 49 | `qa-3826cd91-2cfd-40d2-9098-610fec5f0da2` |
| 7 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-aafd9bcc-2e05-4df4-82fc-dd4b08c8b385` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-cc3deeff-6389-4fcd-8297-e70e898814d2` |
| 9 | `DELETE /v1/accounts/me` | 204 | 57 | `qa-652afc83-885b-4497-bbbe-abb3867093e9` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-1086a36b-eff3-412c-aa83-29646bcbff30` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c2e05b23-a54b-4037-a1a3-6363559959d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c2e05b23-a54b-4037-a1a3-6363559959d2
Content-Type: application/json

--- request body ---
{"handle":"qa-5f865ca93a87","displayName":"QA 5f865ca93a87","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-c2e05b23-a54b-4037-a1a3-6363559959d2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 505
RateLimit-Reset: 9
Location: /v1/accounts/qa-5f865ca93a87
X-Served-Region: eu
Content-Length: 181

{"id":"acc_42237851-02b9-46d0-9bb7-b6971d9e5de7","handle":"qa-5f865ca93a87","displayName":"QA 5f865ca93a87","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.286054683Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-687c116c-bd3a-42f7-a63a-05fd0ce9fcb1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-687c116c-bd3a-42f7-a63a-05fd0ce9fcb1
Content-Type: application/json

--- request body ---
{"handle":"qa-204b46d936a3","displayName":"QA 204b46d936a3","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-687c116c-bd3a-42f7-a63a-05fd0ce9fcb1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 491
RateLimit-Reset: 8
Location: /v1/accounts/qa-204b46d936a3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5db7338d-278b-40cf-b95e-2084d038e7a8","handle":"qa-204b46d936a3","displayName":"QA 204b46d936a3","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.359771980Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-5e36c64f-ecb5-429f-97f4-53e01df462e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e36c64f-ecb5-429f-97f4-53e01df462e9
Content-Type: application/json

--- request body ---
{"handle":"qa-5f865ca93a87","password":"****"}

--- response: 200 in 35 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-5e36c64f-ecb5-429f-97f4-53e01df462e9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 482
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_42237851-02b9-46d0-9bb7-b6971d9e5de7"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b9d030b1-f1ac-4f9b-90b6-13554e2c3a72

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9d030b1-f1ac-4f9b-90b6-13554e2c3a72
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-204b46d936a3","subject":"Error contract","message":"Hi"}

--- response: 201 in 23 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9d030b1-f1ac-4f9b-90b6-13554e2c3a72
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
Location: /v1/conversations/cnv_10ec71b6-07d2-4fe9-9848-5e11cdf6e984
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_10ec71b6-07d2-4fe9-9848-5e11cdf6e984","subject":"Error contract","status":"open","region":"eu","participants":["qa-5f865ca93a87","qa-204b46d936a3"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-01T09:23:22.466199448Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-4ab51b67-d45f-4918-ae38-b84e01ae4ed3

--- request headers ---
Accept: application/json
X-Fault-Key: 4e1bf7db-f66f-4601-a966-8a1e3e1af53d
X-Fault: unavailable-once
X-Correlation-Id: qa-4ab51b67-d45f-4918-ae38-b84e01ae4ed3
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5f865ca93a87","subject":"Probe","message":"Hi"}

--- response: 503 in 35 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4ab51b67-d45f-4918-ae38-b84e01ae4ed3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-4ab51b67-d45f-4918-ae38-b84e01ae4ed3"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-3826cd91-2cfd-40d2-9098-610fec5f0da2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3826cd91-2cfd-40d2-9098-610fec5f0da2
Content-Type: application/json

--- request body ---
{"handle":"qa-204b46d936a3","password":"****"}

--- response: 200 in 49 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-3826cd91-2cfd-40d2-9098-610fec5f0da2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 461
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5db7338d-278b-40cf-b95e-2084d038e7a8"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-aafd9bcc-2e05-4df4-82fc-dd4b08c8b385

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aafd9bcc-2e05-4df4-82fc-dd4b08c8b385
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: text/plain
X-Correlation-Id: qa-aafd9bcc-2e05-4df4-82fc-dd4b08c8b385
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
correlation: qa-cc3deeff-6389-4fcd-8297-e70e898814d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc3deeff-6389-4fcd-8297-e70e898814d2
Content-Type: application/json

--- request body ---
{"handle":"qa-204b46d936a3","password":"****"}

--- response: 401 in 12 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cc3deeff-6389-4fcd-8297-e70e898814d2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 455
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cc3deeff-6389-4fcd-8297-e70e898814d2"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-652afc83-885b-4497-bbbe-abb3867093e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-652afc83-885b-4497-bbbe-abb3867093e9
Content-Type: application/json

--- response: 204 in 57 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: text/plain
X-Correlation-Id: qa-652afc83-885b-4497-bbbe-abb3867093e9
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
correlation: qa-1086a36b-eff3-412c-aa83-29646bcbff30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1086a36b-eff3-412c-aa83-29646bcbff30
Content-Type: application/json

--- request body ---
{"handle":"qa-5f865ca93a87","password":"****"}

--- response: 401 in 14 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1086a36b-eff3-412c-aa83-29646bcbff30
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 444
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1086a36b-eff3-412c-aa83-29646bcbff30"}
```
