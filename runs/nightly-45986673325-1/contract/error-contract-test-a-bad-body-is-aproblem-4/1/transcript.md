# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[4]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 94 | `qa-bd839dac-d309-4369-aaa5-a78a35519799` |
| 2 | `POST /v1/accounts` | 201 | 51 | `qa-c3e7c302-0365-4ee7-9ee2-912a8d8171a7` |
| 3 | `POST /v1/auth/token` | 200 | 56 | `qa-b7771022-7b15-47aa-a992-8e9b96239f37` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-ab308259-695e-4eb3-9ca7-3165ac7a9214` |
| 5 | `POST /v1/accounts` | 415 | 26 | `qa-7a4a63fe-5918-4a97-855d-19cc25348b68` |
| 6 | `POST /v1/auth/token` | 200 | 45 | `qa-4aa115ac-e301-4fe1-98ab-0b850837f815` |
| 7 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-dd6b4a0f-fd56-4da7-bf7f-d9f98cdde99c` |
| 8 | `POST /v1/auth/token` | 401 | 25 | `qa-61a49e54-4097-4e00-a330-013953d19b46` |
| 9 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-43912cae-93f9-47e9-92ab-cc083052487a` |
| 10 | `POST /v1/auth/token` | 401 | 11 | `qa-5be0d6e0-4c2a-4c27-b902-b0b34938dc2f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-bd839dac-d309-4369-aaa5-a78a35519799

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd839dac-d309-4369-aaa5-a78a35519799
Content-Type: application/json

--- request body ---
{"handle":"qa-3ddc028e1796","displayName":"QA 3ddc028e1796","password":"****","region":"eu"}

--- response: 201 in 94 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-bd839dac-d309-4369-aaa5-a78a35519799
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 478
RateLimit-Reset: 8
Location: /v1/accounts/qa-3ddc028e1796
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f2d2ce1-4301-48ae-bd9e-bae0d4a6c803","handle":"qa-3ddc028e1796","displayName":"QA 3ddc028e1796","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.608414020Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c3e7c302-0365-4ee7-9ee2-912a8d8171a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3e7c302-0365-4ee7-9ee2-912a8d8171a7
Content-Type: application/json

--- request body ---
{"handle":"qa-f75c91acc35c","displayName":"QA f75c91acc35c","password":"****","region":"eu"}

--- response: 201 in 51 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-c3e7c302-0365-4ee7-9ee2-912a8d8171a7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 470
RateLimit-Reset: 8
Location: /v1/accounts/qa-f75c91acc35c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_54c796d5-7842-472d-977c-c5f99ef77226","handle":"qa-f75c91acc35c","displayName":"QA f75c91acc35c","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.668311360Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b7771022-7b15-47aa-a992-8e9b96239f37

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b7771022-7b15-47aa-a992-8e9b96239f37
Content-Type: application/json

--- request body ---
{"handle":"qa-3ddc028e1796","password":"****"}

--- response: 200 in 56 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-b7771022-7b15-47aa-a992-8e9b96239f37
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 457
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3f2d2ce1-4301-48ae-bd9e-bae0d4a6c803"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-ab308259-695e-4eb3-9ca7-3165ac7a9214

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab308259-695e-4eb3-9ca7-3165ac7a9214
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f75c91acc35c","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-ab308259-695e-4eb3-9ca7-3165ac7a9214
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
Location: /v1/conversations/cnv_65dc8af8-6b48-4726-b070-e9d8e0502210
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_65dc8af8-6b48-4726-b070-e9d8e0502210","subject":"Error contract","status":"open","region":"eu","participants":["qa-3ddc028e1796","qa-f75c91acc35c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-27T10:59:58.791058990Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-7a4a63fe-5918-4a97-855d-19cc25348b68

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a4a63fe-5918-4a97-855d-19cc25348b68
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 26 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7a4a63fe-5918-4a97-855d-19cc25348b68
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 447
RateLimit-Reset: 8
Content-Length: 252

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts","correlationId":"qa-7a4a63fe-5918-4a97-855d-19cc25348b68"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-4aa115ac-e301-4fe1-98ab-0b850837f815

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4aa115ac-e301-4fe1-98ab-0b850837f815
Content-Type: application/json

--- request body ---
{"handle":"qa-f75c91acc35c","password":"****"}

--- response: 200 in 45 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-4aa115ac-e301-4fe1-98ab-0b850837f815
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 441
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_54c796d5-7842-472d-977c-c5f99ef77226"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dd6b4a0f-fd56-4da7-bf7f-d9f98cdde99c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd6b4a0f-fd56-4da7-bf7f-d9f98cdde99c
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dd6b4a0f-fd56-4da7-bf7f-d9f98cdde99c
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
correlation: qa-61a49e54-4097-4e00-a330-013953d19b46

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61a49e54-4097-4e00-a330-013953d19b46
Content-Type: application/json

--- request body ---
{"handle":"qa-f75c91acc35c","password":"****"}

--- response: 401 in 25 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-61a49e54-4097-4e00-a330-013953d19b46
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 433
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-61a49e54-4097-4e00-a330-013953d19b46"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-43912cae-93f9-47e9-92ab-cc083052487a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43912cae-93f9-47e9-92ab-cc083052487a
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-43912cae-93f9-47e9-92ab-cc083052487a
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
correlation: qa-5be0d6e0-4c2a-4c27-b902-b0b34938dc2f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5be0d6e0-4c2a-4c27-b902-b0b34938dc2f
Content-Type: application/json

--- request body ---
{"handle":"qa-3ddc028e1796","password":"****"}

--- response: 401 in 11 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5be0d6e0-4c2a-4c27-b902-b0b34938dc2f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 426
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5be0d6e0-4c2a-4c27-b902-b0b34938dc2f"}
```
