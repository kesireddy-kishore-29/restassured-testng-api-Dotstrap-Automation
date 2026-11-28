# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/accounts]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[1]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 50 | `qa-9b11ac22-2bc3-4186-872b-3cf9a35e6792` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-2f18e03d-5c58-4f78-bb92-c87801bcd2ec` |
| 3 | `POST /v1/auth/token` | 200 | 15 | `qa-718d334c-8aa3-46fe-9839-a659cbd91b33` |
| 4 | `POST /v1/conversations` | 201 | 27 | `qa-ad1a7762-f4bb-47fc-957a-e8f05d935596` |
| 5 | `POST /v1/accounts` | 503 | 17 | `qa-e5693ffb-777f-4098-b9a3-9f4a6f486b6d` |
| 6 | `POST /v1/auth/token` | 200 | 42 | `qa-28e25a4d-7de9-4301-a5d5-351e8fea6c06` |
| 7 | `DELETE /v1/accounts/me` | 204 | 31 | `qa-3db03aef-80a9-4800-a582-b0d28e1089cb` |
| 8 | `POST /v1/auth/token` | 401 | 27 | `qa-ed13cfda-0529-46fb-b76b-338bba75ad19` |
| 9 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-6fa07316-4425-4a94-911c-ed5df9b1b3fb` |
| 10 | `POST /v1/auth/token` | 401 | 97 | `qa-e557b4ce-31d9-407a-9ab1-aff3a52e4f85` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9b11ac22-2bc3-4186-872b-3cf9a35e6792

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b11ac22-2bc3-4186-872b-3cf9a35e6792
Content-Type: application/json

--- request body ---
{"handle":"qa-68d0746289ab","displayName":"QA 68d0746289ab","password":"****","region":"eu"}

--- response: 201 in 50 ms ---
Date: Fri, 27 Nov 2026 10:59:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-9b11ac22-2bc3-4186-872b-3cf9a35e6792
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 9
Location: /v1/accounts/qa-68d0746289ab
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8b6b9f19-cefa-4672-9581-6da5d79e3a12","handle":"qa-68d0746289ab","displayName":"QA 68d0746289ab","region":"eu","role":"user","createdAt":"2026-11-27T10:59:57.008560737Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2f18e03d-5c58-4f78-bb92-c87801bcd2ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f18e03d-5c58-4f78-bb92-c87801bcd2ec
Content-Type: application/json

--- request body ---
{"handle":"qa-e426f7bdf1aa","displayName":"QA e426f7bdf1aa","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-2f18e03d-5c58-4f78-bb92-c87801bcd2ec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 554
RateLimit-Reset: 9
Location: /v1/accounts/qa-e426f7bdf1aa
X-Served-Region: eu
Content-Length: 181

{"id":"acc_561597f8-a724-4589-97eb-795ac6db594b","handle":"qa-e426f7bdf1aa","displayName":"QA e426f7bdf1aa","region":"eu","role":"user","createdAt":"2026-11-27T10:59:57.082267467Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-718d334c-8aa3-46fe-9839-a659cbd91b33

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-718d334c-8aa3-46fe-9839-a659cbd91b33
Content-Type: application/json

--- request body ---
{"handle":"qa-68d0746289ab","password":"****"}

--- response: 200 in 15 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-718d334c-8aa3-46fe-9839-a659cbd91b33
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 541
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8b6b9f19-cefa-4672-9581-6da5d79e3a12"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-ad1a7762-f4bb-47fc-957a-e8f05d935596

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad1a7762-f4bb-47fc-957a-e8f05d935596
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e426f7bdf1aa","subject":"Error contract","message":"Hi"}

--- response: 201 in 27 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-ad1a7762-f4bb-47fc-957a-e8f05d935596
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
Location: /v1/conversations/cnv_17d25e99-bafb-4584-afb2-7308a099ed70
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_17d25e99-bafb-4584-afb2-7308a099ed70","subject":"Error contract","status":"open","region":"eu","participants":["qa-68d0746289ab","qa-e426f7bdf1aa"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-27T10:59:57.188371422Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-e5693ffb-777f-4098-b9a3-9f4a6f486b6d

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 3fb37ab0-2b54-4231-a261-952f493b0b86
X-Correlation-Id: qa-e5693ffb-777f-4098-b9a3-9f4a6f486b6d
Content-Type: application/json

--- request body ---
{"handle":"qa-3ed85b14121e","displayName":"QA 3ed85b14121e","password":"****","region":"eu"}

--- response: 503 in 17 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e5693ffb-777f-4098-b9a3-9f4a6f486b6d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 256

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts","correlationId":"qa-e5693ffb-777f-4098-b9a3-9f4a6f486b6d"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-28e25a4d-7de9-4301-a5d5-351e8fea6c06

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-28e25a4d-7de9-4301-a5d5-351e8fea6c06
Content-Type: application/json

--- request body ---
{"handle":"qa-e426f7bdf1aa","password":"****"}

--- response: 200 in 42 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-28e25a4d-7de9-4301-a5d5-351e8fea6c06
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 518
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_561597f8-a724-4589-97eb-795ac6db594b"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3db03aef-80a9-4800-a582-b0d28e1089cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3db03aef-80a9-4800-a582-b0d28e1089cb
Content-Type: application/json

--- response: 204 in 31 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3db03aef-80a9-4800-a582-b0d28e1089cb
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
correlation: qa-ed13cfda-0529-46fb-b76b-338bba75ad19

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed13cfda-0529-46fb-b76b-338bba75ad19
Content-Type: application/json

--- request body ---
{"handle":"qa-e426f7bdf1aa","password":"****"}

--- response: 401 in 27 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ed13cfda-0529-46fb-b76b-338bba75ad19
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 499
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ed13cfda-0529-46fb-b76b-338bba75ad19"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6fa07316-4425-4a94-911c-ed5df9b1b3fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6fa07316-4425-4a94-911c-ed5df9b1b3fb
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6fa07316-4425-4a94-911c-ed5df9b1b3fb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-e557b4ce-31d9-407a-9ab1-aff3a52e4f85

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e557b4ce-31d9-407a-9ab1-aff3a52e4f85
Content-Type: application/json

--- request body ---
{"handle":"qa-68d0746289ab","password":"****"}

--- response: 401 in 97 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e557b4ce-31d9-407a-9ab1-aff3a52e4f85
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e557b4ce-31d9-407a-9ab1-aff3a52e4f85"}
```
