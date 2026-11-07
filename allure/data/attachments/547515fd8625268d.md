# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[3]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 40 | `qa-73f9aaf9-35be-423a-9be8-0ebf05e3b7e4` |
| 2 | `POST /v1/accounts` | 201 | 35 | `qa-b8c108ad-0c4c-4ca4-ba2f-5a1ff5cec4cb` |
| 3 | `POST /v1/accounts` | 201 | 37 | `qa-b8dc88f3-68e4-4c51-ac2a-43224b9d2b9d` |
| 4 | `POST /v1/auth/token` | 200 | 27 | `qa-f430b36c-6e16-4d00-9a57-9a8b05a28b55` |
| 5 | `POST /v1/conversations` | 201 | 15 | `qa-18282863-0046-4d10-8f67-5857b88b2667` |
| 6 | `POST /v1/auth/token` | 200 | 12 | `qa-e999529e-e5da-4def-a52b-3ce62d70948e` |
| 7 | `POST /v1/conversations/{id}/read` | 403 | 20 | `qa-9fa36ac2-b6f4-42d3-8ed8-df2348f6cbd5` |
| 8 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-4bbb29b2-4fe3-4a7d-bfdf-235fc34ae9ce` |
| 9 | `POST /v1/auth/token` | 401 | 21 | `qa-1f4f45a4-3da6-4450-a294-de74fbe3dc36` |
| 10 | `POST /v1/auth/token` | 200 | 28 | `qa-92e0f0f0-d111-4813-b25d-6b29611ea795` |
| 11 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-e5a1fdb9-c4ef-49b2-9177-660e8098b8bc` |
| 12 | `POST /v1/auth/token` | 401 | 9 | `qa-ca8cc1a6-2756-4924-a6d2-5047fa1eb6f6` |
| 13 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-70d998ce-0508-40a3-a0e3-fcf5d73f8c5b` |
| 14 | `POST /v1/auth/token` | 401 | 37 | `qa-777b097c-251b-455b-ae5c-b8e19113dc16` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-73f9aaf9-35be-423a-9be8-0ebf05e3b7e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73f9aaf9-35be-423a-9be8-0ebf05e3b7e4
Content-Type: application/json

--- request body ---
{"handle":"qa-a449ce31a28a","displayName":"QA a449ce31a28a","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-73f9aaf9-35be-423a-9be8-0ebf05e3b7e4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 547
RateLimit-Reset: 10
Location: /v1/accounts/qa-a449ce31a28a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_74f08515-0d59-429f-8775-e3822c1d3cae","handle":"qa-a449ce31a28a","displayName":"QA a449ce31a28a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.259025757Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b8c108ad-0c4c-4ca4-ba2f-5a1ff5cec4cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8c108ad-0c4c-4ca4-ba2f-5a1ff5cec4cb
Content-Type: application/json

--- request body ---
{"handle":"qa-877f136db15b","displayName":"QA 877f136db15b","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-b8c108ad-0c4c-4ca4-ba2f-5a1ff5cec4cb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 537
RateLimit-Reset: 9
Location: /v1/accounts/qa-877f136db15b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c7b7b614-f579-4db6-8034-0504920f9696","handle":"qa-877f136db15b","displayName":"QA 877f136db15b","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.315206088Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-b8dc88f3-68e4-4c51-ac2a-43224b9d2b9d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8dc88f3-68e4-4c51-ac2a-43224b9d2b9d
Content-Type: application/json

--- request body ---
{"handle":"qa-6ea736fc9826","displayName":"QA 6ea736fc9826","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-b8dc88f3-68e4-4c51-ac2a-43224b9d2b9d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 531
RateLimit-Reset: 9
Location: /v1/accounts/qa-6ea736fc9826
X-Served-Region: eu
Content-Length: 181

{"id":"acc_092eaea9-c51e-4dc8-b6b4-e89386aadf64","handle":"qa-6ea736fc9826","displayName":"QA 6ea736fc9826","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.366156589Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-f430b36c-6e16-4d00-9a57-9a8b05a28b55

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f430b36c-6e16-4d00-9a57-9a8b05a28b55
Content-Type: application/json

--- request body ---
{"handle":"qa-a449ce31a28a","password":"****"}

--- response: 200 in 27 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-f430b36c-6e16-4d00-9a57-9a8b05a28b55
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 529
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_74f08515-0d59-429f-8775-e3822c1d3cae"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-18282863-0046-4d10-8f67-5857b88b2667

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18282863-0046-4d10-8f67-5857b88b2667
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-877f136db15b","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-18282863-0046-4d10-8f67-5857b88b2667
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
Location: /v1/conversations/cnv_c6a9bb36-c9ec-4dce-8c42-a0cd5a6a9f99
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_c6a9bb36-c9ec-4dce-8c42-a0cd5a6a9f99","subject":"Error contract","status":"open","region":"eu","participants":["qa-a449ce31a28a","qa-877f136db15b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-07T08:54:57.438367640Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e999529e-e5da-4def-a52b-3ce62d70948e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e999529e-e5da-4def-a52b-3ce62d70948e
Content-Type: application/json

--- request body ---
{"handle":"qa-6ea736fc9826","password":"****"}

--- response: 200 in 12 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-e999529e-e5da-4def-a52b-3ce62d70948e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 526
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_092eaea9-c51e-4dc8-b6b4-e89386aadf64"}
```

## 7. POST /v1/conversations/{id}/read

```text
#7 POST http://localhost:7070/v1/conversations/cnv_c6a9bb36-c9ec-4dce-8c42-a0cd5a6a9f99/read
correlation: qa-9fa36ac2-b6f4-42d3-8ed8-df2348f6cbd5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9fa36ac2-b6f4-42d3-8ed8-df2348f6cbd5
Content-Type: application/json

--- response: 403 in 20 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9fa36ac2-b6f4-42d3-8ed8-df2348f6cbd5
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
Content-Length: 290

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_c6a9bb36-c9ec-4dce-8c42-a0cd5a6a9f99/read","correlationId":"qa-9fa36ac2-b6f4-42d3-8ed8-df2348f6cbd5"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4bbb29b2-4fe3-4a7d-bfdf-235fc34ae9ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4bbb29b2-4fe3-4a7d-bfdf-235fc34ae9ce
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4bbb29b2-4fe3-4a7d-bfdf-235fc34ae9ce
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
correlation: qa-1f4f45a4-3da6-4450-a294-de74fbe3dc36

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f4f45a4-3da6-4450-a294-de74fbe3dc36
Content-Type: application/json

--- request body ---
{"handle":"qa-6ea736fc9826","password":"****"}

--- response: 401 in 21 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1f4f45a4-3da6-4450-a294-de74fbe3dc36
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 514
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1f4f45a4-3da6-4450-a294-de74fbe3dc36"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-92e0f0f0-d111-4813-b25d-6b29611ea795

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92e0f0f0-d111-4813-b25d-6b29611ea795
Content-Type: application/json

--- request body ---
{"handle":"qa-877f136db15b","password":"****"}

--- response: 200 in 28 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-92e0f0f0-d111-4813-b25d-6b29611ea795
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 509
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c7b7b614-f579-4db6-8034-0504920f9696"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e5a1fdb9-c4ef-49b2-9177-660e8098b8bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5a1fdb9-c4ef-49b2-9177-660e8098b8bc
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e5a1fdb9-c4ef-49b2-9177-660e8098b8bc
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-ca8cc1a6-2756-4924-a6d2-5047fa1eb6f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca8cc1a6-2756-4924-a6d2-5047fa1eb6f6
Content-Type: application/json

--- request body ---
{"handle":"qa-877f136db15b","password":"****"}

--- response: 401 in 9 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ca8cc1a6-2756-4924-a6d2-5047fa1eb6f6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 490
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ca8cc1a6-2756-4924-a6d2-5047fa1eb6f6"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-70d998ce-0508-40a3-a0e3-fcf5d73f8c5b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70d998ce-0508-40a3-a0e3-fcf5d73f8c5b
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-70d998ce-0508-40a3-a0e3-fcf5d73f8c5b
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-777b097c-251b-455b-ae5c-b8e19113dc16

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-777b097c-251b-455b-ae5c-b8e19113dc16
Content-Type: application/json

--- request body ---
{"handle":"qa-a449ce31a28a","password":"****"}

--- response: 401 in 37 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-777b097c-251b-455b-ae5c-b8e19113dc16
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 475
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-777b097c-251b-455b-ae5c-b8e19113dc16"}
```
