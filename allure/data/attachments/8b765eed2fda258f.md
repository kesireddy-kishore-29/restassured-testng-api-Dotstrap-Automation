# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[8]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-183ab748-0d70-4e95-b157-8ed17c4666f6` |
| 2 | `POST /v1/accounts` | 201 | 36 | `qa-1eb650fd-02a5-409b-8d79-7be5c61cf984` |
| 3 | `POST /v1/auth/token` | 200 | 28 | `qa-b83f563e-2c35-4fcb-b506-5c6b61b6e8ba` |
| 4 | `POST /v1/conversations` | 201 | 35 | `qa-29a85c33-97c5-4933-98c5-95b773d80db9` |
| 5 | `GET /v1/conversations/{id}` | 503 | 23 | `qa-8bec9fe7-0a21-4059-a8a1-5bc949c5489a` |
| 6 | `POST /v1/auth/token` | 200 | 30 | `qa-bcd9225f-5846-4c30-b0f0-ebb43215c77b` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-9a8f0fc8-ca22-47de-ad85-ae5d15f3b734` |
| 8 | `POST /v1/auth/token` | 401 | 15 | `qa-cc0e1a29-736b-4f8b-9da5-9d3a4beae0fc` |
| 9 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-a44ddc06-3668-4e37-8e3c-b69f64579bdd` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-0adbf37b-e6ac-4184-a984-675f165f4ba9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-183ab748-0d70-4e95-b157-8ed17c4666f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-183ab748-0d70-4e95-b157-8ed17c4666f6
Content-Type: application/json

--- request body ---
{"handle":"qa-e797529f506c","displayName":"QA e797529f506c","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-183ab748-0d70-4e95-b157-8ed17c4666f6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 427
RateLimit-Reset: 7
Location: /v1/accounts/qa-e797529f506c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9624e34e-4744-476f-8f2b-4c85243779d8","handle":"qa-e797529f506c","displayName":"QA e797529f506c","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.708360664Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-1eb650fd-02a5-409b-8d79-7be5c61cf984

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1eb650fd-02a5-409b-8d79-7be5c61cf984
Content-Type: application/json

--- request body ---
{"handle":"qa-818c0474c126","displayName":"QA 818c0474c126","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-1eb650fd-02a5-409b-8d79-7be5c61cf984
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
Location: /v1/accounts/qa-818c0474c126
X-Served-Region: eu
Content-Length: 181

{"id":"acc_002f6b40-9082-42cf-8d4d-8dbe32dfb1d9","handle":"qa-818c0474c126","displayName":"QA 818c0474c126","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.757045623Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b83f563e-2c35-4fcb-b506-5c6b61b6e8ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b83f563e-2c35-4fcb-b506-5c6b61b6e8ba
Content-Type: application/json

--- request body ---
{"handle":"qa-e797529f506c","password":"****"}

--- response: 200 in 28 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-b83f563e-2c35-4fcb-b506-5c6b61b6e8ba
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 414
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9624e34e-4744-476f-8f2b-4c85243779d8"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-29a85c33-97c5-4933-98c5-95b773d80db9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29a85c33-97c5-4933-98c5-95b773d80db9
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-818c0474c126","subject":"Error contract","message":"Hi"}

--- response: 201 in 35 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-29a85c33-97c5-4933-98c5-95b773d80db9
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
Location: /v1/conversations/cnv_2cd55f18-d511-46c9-8d7a-7f2381024634
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_2cd55f18-d511-46c9-8d7a-7f2381024634","subject":"Error contract","status":"open","region":"eu","participants":["qa-e797529f506c","qa-818c0474c126"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-28T10:37:24.847845655Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_2cd55f18-d511-46c9-8d7a-7f2381024634
correlation: qa-8bec9fe7-0a21-4059-a8a1-5bc949c5489a

--- request headers ---
Accept: application/json
X-Fault-Key: 281d0278-c113-4f0f-84c4-1379229413a1
X-Fault: unavailable-once
X-Correlation-Id: qa-8bec9fe7-0a21-4059-a8a1-5bc949c5489a
Content-Type: application/json

--- response: 503 in 23 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8bec9fe7-0a21-4059-a8a1-5bc949c5489a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 302

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_2cd55f18-d511-46c9-8d7a-7f2381024634","correlationId":"qa-8bec9fe7-0a21-4059-a8a1-5bc949c5489a"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-bcd9225f-5846-4c30-b0f0-ebb43215c77b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bcd9225f-5846-4c30-b0f0-ebb43215c77b
Content-Type: application/json

--- request body ---
{"handle":"qa-818c0474c126","password":"****"}

--- response: 200 in 30 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-bcd9225f-5846-4c30-b0f0-ebb43215c77b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 389
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_002f6b40-9082-42cf-8d4d-8dbe32dfb1d9"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9a8f0fc8-ca22-47de-ad85-ae5d15f3b734

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a8f0fc8-ca22-47de-ad85-ae5d15f3b734
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9a8f0fc8-ca22-47de-ad85-ae5d15f3b734
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
correlation: qa-cc0e1a29-736b-4f8b-9da5-9d3a4beae0fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc0e1a29-736b-4f8b-9da5-9d3a4beae0fc
Content-Type: application/json

--- request body ---
{"handle":"qa-818c0474c126","password":"****"}

--- response: 401 in 15 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cc0e1a29-736b-4f8b-9da5-9d3a4beae0fc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 384
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cc0e1a29-736b-4f8b-9da5-9d3a4beae0fc"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a44ddc06-3668-4e37-8e3c-b69f64579bdd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a44ddc06-3668-4e37-8e3c-b69f64579bdd
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a44ddc06-3668-4e37-8e3c-b69f64579bdd
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
correlation: qa-0adbf37b-e6ac-4184-a984-675f165f4ba9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0adbf37b-e6ac-4184-a984-675f165f4ba9
Content-Type: application/json

--- request body ---
{"handle":"qa-e797529f506c","password":"****"}

--- response: 401 in 10 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0adbf37b-e6ac-4184-a984-675f165f4ba9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 382
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0adbf37b-e6ac-4184-a984-675f165f4ba9"}
```
