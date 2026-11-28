# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[9]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 34 | `qa-32d19811-3ecd-4a87-a5b0-d93555097d17` |
| 2 | `POST /v1/accounts` | 201 | 42 | `qa-8d5388a1-94ee-40f1-932a-b364b25358e6` |
| 3 | `POST /v1/auth/token` | 200 | 44 | `qa-a7104280-c03d-4762-940d-ed37575d5c3a` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-aaacf2dc-732f-4ad0-b775-36b4424a0461` |
| 5 | `GET /v1/conversations/{id}/messages` | 503 | 14 | `qa-99b4e542-3faa-421c-821c-e12d40033052` |
| 6 | `POST /v1/auth/token` | 200 | 38 | `qa-f1bad13c-b21f-4da6-8d9a-a9220f674777` |
| 7 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-72fe62ee-bd39-44cd-b093-3b5f8536f880` |
| 8 | `POST /v1/auth/token` | 401 | 20 | `qa-c0a814ca-b0cc-4bdb-8cf8-ef6fe77b6aeb` |
| 9 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-025ee70c-67f0-4e7a-b3f8-be7d62ddf690` |
| 10 | `POST /v1/auth/token` | 401 | 19 | `qa-807099f6-88f2-4d39-b597-e59acbbfcc1c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-32d19811-3ecd-4a87-a5b0-d93555097d17

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32d19811-3ecd-4a87-a5b0-d93555097d17
Content-Type: application/json

--- request body ---
{"handle":"qa-499951de2149","displayName":"QA 499951de2149","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-32d19811-3ecd-4a87-a5b0-d93555097d17
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 412
RateLimit-Reset: 7
Location: /v1/accounts/qa-499951de2149
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e5477b91-3668-4b1a-a7b4-379052549872","handle":"qa-499951de2149","displayName":"QA 499951de2149","region":"eu","role":"user","createdAt":"2026-11-27T10:59:59.228053120Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-8d5388a1-94ee-40f1-932a-b364b25358e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d5388a1-94ee-40f1-932a-b364b25358e6
Content-Type: application/json

--- request body ---
{"handle":"qa-8e4a7405c2dd","displayName":"QA 8e4a7405c2dd","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-8d5388a1-94ee-40f1-932a-b364b25358e6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 404
RateLimit-Reset: 7
Location: /v1/accounts/qa-8e4a7405c2dd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e0ec40b9-20c2-4c05-a037-713652aa3952","handle":"qa-8e4a7405c2dd","displayName":"QA 8e4a7405c2dd","region":"eu","role":"user","createdAt":"2026-11-27T10:59:59.263354574Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a7104280-c03d-4762-940d-ed37575d5c3a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7104280-c03d-4762-940d-ed37575d5c3a
Content-Type: application/json

--- request body ---
{"handle":"qa-499951de2149","password":"****"}

--- response: 200 in 44 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-a7104280-c03d-4762-940d-ed37575d5c3a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 397
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e5477b91-3668-4b1a-a7b4-379052549872"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-aaacf2dc-732f-4ad0-b775-36b4424a0461

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aaacf2dc-732f-4ad0-b775-36b4424a0461
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8e4a7405c2dd","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-aaacf2dc-732f-4ad0-b775-36b4424a0461
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
Location: /v1/conversations/cnv_e8cf8158-969c-4bdf-9d4d-ac568a0b23b0
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e8cf8158-969c-4bdf-9d4d-ac568a0b23b0","subject":"Error contract","status":"open","region":"eu","participants":["qa-499951de2149","qa-8e4a7405c2dd"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-27T10:59:59.362600680Z"}
```

## 5. GET /v1/conversations/{id}/messages

```text
#5 GET http://localhost:7070/v1/conversations/cnv_e8cf8158-969c-4bdf-9d4d-ac568a0b23b0/messages
correlation: qa-99b4e542-3faa-421c-821c-e12d40033052

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: c9423a03-a255-48d0-aac2-9fec140385ab
X-Correlation-Id: qa-99b4e542-3faa-421c-821c-e12d40033052
Content-Type: application/json

--- response: 503 in 14 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-99b4e542-3faa-421c-821c-e12d40033052
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_e8cf8158-969c-4bdf-9d4d-ac568a0b23b0/messages","correlationId":"qa-99b4e542-3faa-421c-821c-e12d40033052"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f1bad13c-b21f-4da6-8d9a-a9220f674777

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1bad13c-b21f-4da6-8d9a-a9220f674777
Content-Type: application/json

--- request body ---
{"handle":"qa-8e4a7405c2dd","password":"****"}

--- response: 200 in 38 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-f1bad13c-b21f-4da6-8d9a-a9220f674777
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 381
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e0ec40b9-20c2-4c05-a037-713652aa3952"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-72fe62ee-bd39-44cd-b093-3b5f8536f880

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-72fe62ee-bd39-44cd-b093-3b5f8536f880
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-72fe62ee-bd39-44cd-b093-3b5f8536f880
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
correlation: qa-c0a814ca-b0cc-4bdb-8cf8-ef6fe77b6aeb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0a814ca-b0cc-4bdb-8cf8-ef6fe77b6aeb
Content-Type: application/json

--- request body ---
{"handle":"qa-8e4a7405c2dd","password":"****"}

--- response: 401 in 20 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c0a814ca-b0cc-4bdb-8cf8-ef6fe77b6aeb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 372
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c0a814ca-b0cc-4bdb-8cf8-ef6fe77b6aeb"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-025ee70c-67f0-4e7a-b3f8-be7d62ddf690

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-025ee70c-67f0-4e7a-b3f8-be7d62ddf690
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-025ee70c-67f0-4e7a-b3f8-be7d62ddf690
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
correlation: qa-807099f6-88f2-4d39-b597-e59acbbfcc1c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-807099f6-88f2-4d39-b597-e59acbbfcc1c
Content-Type: application/json

--- request body ---
{"handle":"qa-499951de2149","password":"****"}

--- response: 401 in 19 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-807099f6-88f2-4d39-b597-e59acbbfcc1c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 365
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-807099f6-88f2-4d39-b597-e59acbbfcc1c"}
```
