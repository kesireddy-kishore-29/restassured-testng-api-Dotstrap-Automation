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
| 1 | `POST /v1/accounts` | 201 | 16 | `qa-dde000e4-8498-4cf1-b6fd-eb7e01f40ca2` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-b13f422b-12b1-489b-a9de-cb11c94e89a7` |
| 3 | `POST /v1/accounts` | 201 | 24 | `qa-d3ca5999-cd7d-492a-9203-36afd57440b7` |
| 4 | `POST /v1/auth/token` | 200 | 12 | `qa-7a59aaf4-698b-43ee-a133-a8064248a7ac` |
| 5 | `POST /v1/conversations` | 201 | 7 | `qa-2136548b-ebc9-4b6b-9d7b-f1668fa2978a` |
| 6 | `POST /v1/auth/token` | 200 | 7 | `qa-422ff022-ded5-4f12-930e-5579e06e00f7` |
| 7 | `POST /v1/conversations/{id}/read` | 403 | 5 | `qa-bc4aa01a-c98b-4019-ad15-8c4585d32c68` |
| 8 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-d048e45b-afa4-4364-b876-8190ad7df51d` |
| 9 | `POST /v1/auth/token` | 401 | 28 | `qa-bbbedbf7-b52c-4fae-923b-507c47866deb` |
| 10 | `POST /v1/auth/token` | 200 | 19 | `qa-c4890aed-bcb5-4c88-a206-ba25c0851b72` |
| 11 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-d8563292-ac7d-40bf-9aee-5849221eb887` |
| 12 | `POST /v1/auth/token` | 401 | 3 | `qa-b397043c-c1bd-4513-a295-90b48d05c140` |
| 13 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-082bc256-062c-4df4-8fbf-377d86615718` |
| 14 | `POST /v1/auth/token` | 401 | 4 | `qa-b7e4a836-b080-4e3a-a395-5b771b8cecc1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-dde000e4-8498-4cf1-b6fd-eb7e01f40ca2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dde000e4-8498-4cf1-b6fd-eb7e01f40ca2
Content-Type: application/json

--- request body ---
{"handle":"qa-25ed2611d4aa","displayName":"QA 25ed2611d4aa","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-dde000e4-8498-4cf1-b6fd-eb7e01f40ca2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 543
RateLimit-Reset: 10
Location: /v1/accounts/qa-25ed2611d4aa
X-Served-Region: eu
Content-Length: 181

{"id":"acc_986c6d65-6eef-400c-a24b-688ec53d5723","handle":"qa-25ed2611d4aa","displayName":"QA 25ed2611d4aa","region":"eu","role":"user","createdAt":"2026-10-28T08:42:51.534910953Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b13f422b-12b1-489b-a9de-cb11c94e89a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b13f422b-12b1-489b-a9de-cb11c94e89a7
Content-Type: application/json

--- request body ---
{"handle":"qa-c5edc6a9d28e","displayName":"QA c5edc6a9d28e","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-b13f422b-12b1-489b-a9de-cb11c94e89a7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 539
RateLimit-Reset: 10
Location: /v1/accounts/qa-c5edc6a9d28e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_31614909-09e1-4540-b151-394eefc447b3","handle":"qa-c5edc6a9d28e","displayName":"QA c5edc6a9d28e","region":"eu","role":"user","createdAt":"2026-10-28T08:42:51.557843982Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-d3ca5999-cd7d-492a-9203-36afd57440b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3ca5999-cd7d-492a-9203-36afd57440b7
Content-Type: application/json

--- request body ---
{"handle":"qa-21a4e1f6ea75","displayName":"QA 21a4e1f6ea75","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-d3ca5999-cd7d-492a-9203-36afd57440b7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 532
RateLimit-Reset: 10
Location: /v1/accounts/qa-21a4e1f6ea75
X-Served-Region: eu
Content-Length: 181

{"id":"acc_481a4f38-2fa7-4aa0-95ba-32e6e41f49b4","handle":"qa-21a4e1f6ea75","displayName":"QA 21a4e1f6ea75","region":"eu","role":"user","createdAt":"2026-10-28T08:42:51.598647356Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-7a59aaf4-698b-43ee-a133-a8064248a7ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a59aaf4-698b-43ee-a133-a8064248a7ac
Content-Type: application/json

--- request body ---
{"handle":"qa-25ed2611d4aa","password":"****"}

--- response: 200 in 12 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-7a59aaf4-698b-43ee-a133-a8064248a7ac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 530
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_986c6d65-6eef-400c-a24b-688ec53d5723"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-2136548b-ebc9-4b6b-9d7b-f1668fa2978a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2136548b-ebc9-4b6b-9d7b-f1668fa2978a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c5edc6a9d28e","subject":"Error contract","message":"Hi"}

--- response: 201 in 7 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-2136548b-ebc9-4b6b-9d7b-f1668fa2978a
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
Location: /v1/conversations/cnv_7e2ee185-8ab1-47cb-ac49-4a4baac4c137
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_7e2ee185-8ab1-47cb-ac49-4a4baac4c137","subject":"Error contract","status":"open","region":"eu","participants":["qa-25ed2611d4aa","qa-c5edc6a9d28e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-28T08:42:51.631746161Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-422ff022-ded5-4f12-930e-5579e06e00f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-422ff022-ded5-4f12-930e-5579e06e00f7
Content-Type: application/json

--- request body ---
{"handle":"qa-21a4e1f6ea75","password":"****"}

--- response: 200 in 7 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-422ff022-ded5-4f12-930e-5579e06e00f7
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_481a4f38-2fa7-4aa0-95ba-32e6e41f49b4"}
```

## 7. POST /v1/conversations/{id}/read

```text
#7 POST http://localhost:7070/v1/conversations/cnv_7e2ee185-8ab1-47cb-ac49-4a4baac4c137/read
correlation: qa-bc4aa01a-c98b-4019-ad15-8c4585d32c68

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc4aa01a-c98b-4019-ad15-8c4585d32c68
Content-Type: application/json

--- response: 403 in 5 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bc4aa01a-c98b-4019-ad15-8c4585d32c68
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_7e2ee185-8ab1-47cb-ac49-4a4baac4c137/read","correlationId":"qa-bc4aa01a-c98b-4019-ad15-8c4585d32c68"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d048e45b-afa4-4364-b876-8190ad7df51d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d048e45b-afa4-4364-b876-8190ad7df51d
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d048e45b-afa4-4364-b876-8190ad7df51d
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
correlation: qa-bbbedbf7-b52c-4fae-923b-507c47866deb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bbbedbf7-b52c-4fae-923b-507c47866deb
Content-Type: application/json

--- request body ---
{"handle":"qa-21a4e1f6ea75","password":"****"}

--- response: 401 in 28 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bbbedbf7-b52c-4fae-923b-507c47866deb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 517
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bbbedbf7-b52c-4fae-923b-507c47866deb"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-c4890aed-bcb5-4c88-a206-ba25c0851b72

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4890aed-bcb5-4c88-a206-ba25c0851b72
Content-Type: application/json

--- request body ---
{"handle":"qa-c5edc6a9d28e","password":"****"}

--- response: 200 in 19 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-c4890aed-bcb5-4c88-a206-ba25c0851b72
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 510
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_31614909-09e1-4540-b151-394eefc447b3"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d8563292-ac7d-40bf-9aee-5849221eb887

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8563292-ac7d-40bf-9aee-5849221eb887
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d8563292-ac7d-40bf-9aee-5849221eb887
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
correlation: qa-b397043c-c1bd-4513-a295-90b48d05c140

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b397043c-c1bd-4513-a295-90b48d05c140
Content-Type: application/json

--- request body ---
{"handle":"qa-c5edc6a9d28e","password":"****"}

--- response: 401 in 3 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b397043c-c1bd-4513-a295-90b48d05c140
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 504
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b397043c-c1bd-4513-a295-90b48d05c140"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-082bc256-062c-4df4-8fbf-377d86615718

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-082bc256-062c-4df4-8fbf-377d86615718
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-082bc256-062c-4df4-8fbf-377d86615718
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
correlation: qa-b7e4a836-b080-4e3a-a395-5b771b8cecc1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b7e4a836-b080-4e3a-a395-5b771b8cecc1
Content-Type: application/json

--- request body ---
{"handle":"qa-25ed2611d4aa","password":"****"}

--- response: 401 in 4 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b7e4a836-b080-4e3a-a395-5b771b8cecc1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 486
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b7e4a836-b080-4e3a-a395-5b771b8cecc1"}
```
