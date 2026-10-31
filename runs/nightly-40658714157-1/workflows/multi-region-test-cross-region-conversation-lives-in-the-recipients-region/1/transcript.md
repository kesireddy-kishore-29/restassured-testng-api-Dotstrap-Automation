# Transcript: A cross-region conversation is stored in the recipient's region, for both sides

| | |
|---|---|
| Test | `com.qaautomation.tests.workflows.MultiRegionTest#crossRegionConversationLivesInTheRecipientsRegion` |
| Features | FEAT-REGION-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 302 | `qa-30aa097e-76d2-4aa4-adf9-e20012924239` |
| 2 | `POST /v1/accounts` | 201 | 47 | `qa-fab00306-0d9f-4cb1-b344-77c5bf76aec4` |
| 3 | `POST /v1/auth/token` | 200 | 24 | `qa-1b7962ab-c643-4f16-8910-381d9004918b` |
| 4 | `POST /v1/conversations` | 201 | 48 | `qa-eaa72dcb-648c-49b1-8b58-6b7d38b83e8b` |
| 5 | `GET /v1/conversations/{id}` | 200 | 19 | `qa-a65ff339-171c-4c99-b299-4b09fb73e897` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-48837e3e-ed65-455c-b69e-714ddab894e3` |
| 7 | `GET /v1/conversations/{id}` | 200 | 8 | `qa-3de62395-729b-43c2-aec9-448c6acc5529` |
| 8 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-21ba7d3f-e5d0-4c46-bbc5-58198af078b7` |
| 9 | `POST /v1/auth/token` | 401 | 33 | `qa-e440edcd-0baf-4b86-adea-d78c471bf674` |
| 10 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-3a02e47e-2522-4b40-af48-57b30135999d` |
| 11 | `POST /v1/auth/token` | 401 | 9 | `qa-52fb9f43-264c-446f-b180-67b307a44506` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-30aa097e-76d2-4aa4-adf9-e20012924239

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30aa097e-76d2-4aa4-adf9-e20012924239
Content-Type: application/json

--- request body ---
{"handle":"qa-a9ce502ce3e6","displayName":"QA a9ce502ce3e6","password":"****","region":"in"}

--- response: 201 in 302 ms ---
Date: Wed, 28 Oct 2026 08:42:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-30aa097e-76d2-4aa4-adf9-e20012924239
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-a9ce502ce3e6
X-Served-Region: in
Content-Length: 181

{"id":"acc_b7bda0e3-7935-49f5-aa6a-c5a77d6ed031","handle":"qa-a9ce502ce3e6","displayName":"QA a9ce502ce3e6","region":"in","role":"user","createdAt":"2026-10-28T08:42:54.768145444Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-fab00306-0d9f-4cb1-b344-77c5bf76aec4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fab00306-0d9f-4cb1-b344-77c5bf76aec4
Content-Type: application/json

--- request body ---
{"handle":"qa-f0908ef6171d","displayName":"QA f0908ef6171d","password":"****","region":"eu"}

--- response: 201 in 47 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-fab00306-0d9f-4cb1-b344-77c5bf76aec4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Location: /v1/accounts/qa-f0908ef6171d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5c1e5c42-e563-4c75-97cb-4e7cc548cf8b","handle":"qa-f0908ef6171d","displayName":"QA f0908ef6171d","region":"eu","role":"user","createdAt":"2026-10-28T08:42:55.073218049Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-1b7962ab-c643-4f16-8910-381d9004918b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b7962ab-c643-4f16-8910-381d9004918b
Content-Type: application/json

--- request body ---
{"handle":"qa-a9ce502ce3e6","password":"****"}

--- response: 200 in 24 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-1b7962ab-c643-4f16-8910-381d9004918b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b7bda0e3-7935-49f5-aa6a-c5a77d6ed031"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-eaa72dcb-648c-49b1-8b58-6b7d38b83e8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eaa72dcb-648c-49b1-8b58-6b7d38b83e8b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f0908ef6171d","subject":"Across regions","message":"Namaste"}

--- response: 201 in 48 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-eaa72dcb-648c-49b1-8b58-6b7d38b83e8b
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
X-Served-Region: in
Location: /v1/conversations/cnv_fffd835e-1dbd-4895-b2be-cf4680ec2203
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_fffd835e-1dbd-4895-b2be-cf4680ec2203","subject":"Across regions","status":"open","region":"eu","participants":["qa-a9ce502ce3e6","qa-f0908ef6171d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-28T08:42:55.242903091Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_fffd835e-1dbd-4895-b2be-cf4680ec2203
correlation: qa-a65ff339-171c-4c99-b299-4b09fb73e897

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a65ff339-171c-4c99-b299-4b09fb73e897
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-a65ff339-171c-4c99-b299-4b09fb73e897
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
X-Served-Region: in
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_fffd835e-1dbd-4895-b2be-cf4680ec2203","subject":"Across regions","status":"open","region":"eu","participants":["qa-a9ce502ce3e6","qa-f0908ef6171d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-28T08:42:55.242903091Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-48837e3e-ed65-455c-b69e-714ddab894e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48837e3e-ed65-455c-b69e-714ddab894e3
Content-Type: application/json

--- request body ---
{"handle":"qa-f0908ef6171d","password":"****"}

--- response: 200 in 19 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-48837e3e-ed65-455c-b69e-714ddab894e3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5c1e5c42-e563-4c75-97cb-4e7cc548cf8b"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_fffd835e-1dbd-4895-b2be-cf4680ec2203
correlation: qa-3de62395-729b-43c2-aec9-448c6acc5529

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3de62395-729b-43c2-aec9-448c6acc5529
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-3de62395-729b-43c2-aec9-448c6acc5529
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
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_fffd835e-1dbd-4895-b2be-cf4680ec2203","subject":"Across regions","status":"open","region":"eu","participants":["qa-a9ce502ce3e6","qa-f0908ef6171d"],"messageCount":1,"unreadCount":1,"createdAt":"2026-10-28T08:42:55.242903091Z"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-21ba7d3f-e5d0-4c46-bbc5-58198af078b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-21ba7d3f-e5d0-4c46-bbc5-58198af078b7
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-21ba7d3f-e5d0-4c46-bbc5-58198af078b7
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

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-e440edcd-0baf-4b86-adea-d78c471bf674

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e440edcd-0baf-4b86-adea-d78c471bf674
Content-Type: application/json

--- request body ---
{"handle":"qa-f0908ef6171d","password":"****"}

--- response: 401 in 33 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e440edcd-0baf-4b86-adea-d78c471bf674
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e440edcd-0baf-4b86-adea-d78c471bf674"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3a02e47e-2522-4b40-af48-57b30135999d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a02e47e-2522-4b40-af48-57b30135999d
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3a02e47e-2522-4b40-af48-57b30135999d
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
X-Served-Region: in
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-52fb9f43-264c-446f-b180-67b307a44506

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52fb9f43-264c-446f-b180-67b307a44506
Content-Type: application/json

--- request body ---
{"handle":"qa-a9ce502ce3e6","password":"****"}

--- response: 401 in 9 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-52fb9f43-264c-446f-b180-67b307a44506
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-52fb9f43-264c-446f-b180-67b307a44506"}
```
