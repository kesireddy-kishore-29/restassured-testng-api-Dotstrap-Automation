# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[12]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 15 | `qa-c211f6dd-0715-45ff-bdd1-a47bd247b607` |
| 2 | `POST /v1/accounts` | 201 | 24 | `qa-eb4fa7c5-9d54-4c35-af9d-1b24e706a31d` |
| 3 | `POST /v1/auth/token` | 200 | 19 | `qa-36e3ae9f-9890-4af4-bc4a-f1d9bf22db0d` |
| 4 | `POST /v1/conversations` | 201 | 23 | `qa-faa5f39c-d214-4572-8d22-29eb627b629c` |
| 5 | `POST /v1/conversations/{id}/close` | 503 | 12 | `qa-e28da935-0009-4916-80c4-ffae8b83b528` |
| 6 | `POST /v1/auth/token` | 200 | 43 | `qa-2507bead-6e1c-44e3-aef4-da70b8101338` |
| 7 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-ea1ef638-9611-4ded-9b7a-6ca077893e0c` |
| 8 | `POST /v1/auth/token` | 401 | 8 | `qa-ac834684-075d-4f2d-b89f-509fa11faa7d` |
| 9 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-7b5b7227-fed9-434d-b31d-11f0b09f4b89` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-cee5a3ef-7d31-4459-b078-7fde711e6f84` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c211f6dd-0715-45ff-bdd1-a47bd247b607

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c211f6dd-0715-45ff-bdd1-a47bd247b607
Content-Type: application/json

--- request body ---
{"handle":"qa-78f7d83d1f33","displayName":"QA 78f7d83d1f33","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-c211f6dd-0715-45ff-bdd1-a47bd247b607
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 379
RateLimit-Reset: 6
Location: /v1/accounts/qa-78f7d83d1f33
X-Served-Region: eu
Content-Length: 181

{"id":"acc_28740a82-cdbb-46fb-8dc5-be45bc5b67be","handle":"qa-78f7d83d1f33","displayName":"QA 78f7d83d1f33","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.906694466Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-eb4fa7c5-9d54-4c35-af9d-1b24e706a31d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb4fa7c5-9d54-4c35-af9d-1b24e706a31d
Content-Type: application/json

--- request body ---
{"handle":"qa-982816897ec4","displayName":"QA 982816897ec4","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-eb4fa7c5-9d54-4c35-af9d-1b24e706a31d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 375
RateLimit-Reset: 6
Location: /v1/accounts/qa-982816897ec4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_dbcd5f63-672e-458f-b37d-3ab6709050b8","handle":"qa-982816897ec4","displayName":"QA 982816897ec4","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.946255594Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-36e3ae9f-9890-4af4-bc4a-f1d9bf22db0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-36e3ae9f-9890-4af4-bc4a-f1d9bf22db0d
Content-Type: application/json

--- request body ---
{"handle":"qa-78f7d83d1f33","password":"****"}

--- response: 200 in 19 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-36e3ae9f-9890-4af4-bc4a-f1d9bf22db0d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 372
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_28740a82-cdbb-46fb-8dc5-be45bc5b67be"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-faa5f39c-d214-4572-8d22-29eb627b629c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-faa5f39c-d214-4572-8d22-29eb627b629c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-982816897ec4","subject":"Error contract","message":"Hi"}

--- response: 201 in 23 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-faa5f39c-d214-4572-8d22-29eb627b629c
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
Location: /v1/conversations/cnv_f88345a6-378c-4c76-a8e5-82c4bbb49d69
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f88345a6-378c-4c76-a8e5-82c4bbb49d69","subject":"Error contract","status":"open","region":"eu","participants":["qa-78f7d83d1f33","qa-982816897ec4"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-21T09:57:12.013830254Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_f88345a6-378c-4c76-a8e5-82c4bbb49d69/close
correlation: qa-e28da935-0009-4916-80c4-ffae8b83b528

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: c5beedf4-9bb5-4584-907f-0cf7cb040664
X-Correlation-Id: qa-e28da935-0009-4916-80c4-ffae8b83b528
Content-Type: application/json

--- response: 503 in 12 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e28da935-0009-4916-80c4-ffae8b83b528
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 308

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_f88345a6-378c-4c76-a8e5-82c4bbb49d69/close","correlationId":"qa-e28da935-0009-4916-80c4-ffae8b83b528"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-2507bead-6e1c-44e3-aef4-da70b8101338

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2507bead-6e1c-44e3-aef4-da70b8101338
Content-Type: application/json

--- request body ---
{"handle":"qa-982816897ec4","password":"****"}

--- response: 200 in 43 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-2507bead-6e1c-44e3-aef4-da70b8101338
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 358
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dbcd5f63-672e-458f-b37d-3ab6709050b8"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ea1ef638-9611-4ded-9b7a-6ca077893e0c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea1ef638-9611-4ded-9b7a-6ca077893e0c
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ea1ef638-9611-4ded-9b7a-6ca077893e0c
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
correlation: qa-ac834684-075d-4f2d-b89f-509fa11faa7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac834684-075d-4f2d-b89f-509fa11faa7d
Content-Type: application/json

--- request body ---
{"handle":"qa-982816897ec4","password":"****"}

--- response: 401 in 8 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ac834684-075d-4f2d-b89f-509fa11faa7d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 350
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ac834684-075d-4f2d-b89f-509fa11faa7d"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7b5b7227-fed9-434d-b31d-11f0b09f4b89

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b5b7227-fed9-434d-b31d-11f0b09f4b89
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7b5b7227-fed9-434d-b31d-11f0b09f4b89
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
correlation: qa-cee5a3ef-7d31-4459-b078-7fde711e6f84

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cee5a3ef-7d31-4459-b078-7fde711e6f84
Content-Type: application/json

--- request body ---
{"handle":"qa-78f7d83d1f33","password":"****"}

--- response: 401 in 14 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cee5a3ef-7d31-4459-b078-7fde711e6f84
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 344
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cee5a3ef-7d31-4459-b078-7fde711e6f84"}
```
