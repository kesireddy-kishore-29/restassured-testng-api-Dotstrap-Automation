# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[2]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 36 | `qa-f18cdabc-64ad-450c-916f-3028d3e590ca` |
| 2 | `POST /v1/accounts` | 201 | 31 | `qa-4b4a54bd-4951-418d-aae4-2b0493821da6` |
| 3 | `POST /v1/auth/token` | 200 | 42 | `qa-934d1fe9-08b4-41c3-a349-198bc971a2f0` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-aeedeae2-7f9f-4703-af51-2e5e9f4ec95e` |
| 5 | `POST /v1/auth/token` | 422 | 92 | `qa-a387c231-eaae-4156-a2f7-e89c45ebd168` |
| 6 | `POST /v1/auth/token` | 200 | 46 | `qa-212191bc-49a8-4e27-92b5-3a63bd2a3c95` |
| 7 | `DELETE /v1/accounts/me` | 204 | 36 | `qa-6c1a36c5-a7fa-4934-b7ce-6e7433730ca7` |
| 8 | `POST /v1/auth/token` | 401 | 38 | `qa-89d5b40b-bede-46e8-9302-1f6831bc8fe6` |
| 9 | `DELETE /v1/accounts/me` | 204 | 31 | `qa-26bebe36-1496-4696-a032-a71cba7e4acb` |
| 10 | `POST /v1/auth/token` | 401 | 16 | `qa-c1fd978d-7641-42e8-8ff6-02ba302d2fae` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f18cdabc-64ad-450c-916f-3028d3e590ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f18cdabc-64ad-450c-916f-3028d3e590ca
Content-Type: application/json

--- request body ---
{"handle":"qa-1786b682662e","displayName":"QA 1786b682662e","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-f18cdabc-64ad-450c-916f-3028d3e590ca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 9
Location: /v1/accounts/qa-1786b682662e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2ee63990-ebd4-4371-9018-6aae0ebfe889","handle":"qa-1786b682662e","displayName":"QA 1786b682662e","region":"eu","role":"user","createdAt":"2026-11-21T09:57:09.038630885Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4b4a54bd-4951-418d-aae4-2b0493821da6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b4a54bd-4951-418d-aae4-2b0493821da6
Content-Type: application/json

--- request body ---
{"handle":"qa-756da669e4b6","displayName":"QA 756da669e4b6","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-4b4a54bd-4951-418d-aae4-2b0493821da6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 9
Location: /v1/accounts/qa-756da669e4b6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c1aabc89-b2a7-4e1a-a027-14f974b253f2","handle":"qa-756da669e4b6","displayName":"QA 756da669e4b6","region":"eu","role":"user","createdAt":"2026-11-21T09:57:09.097846074Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-934d1fe9-08b4-41c3-a349-198bc971a2f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-934d1fe9-08b4-41c3-a349-198bc971a2f0
Content-Type: application/json

--- request body ---
{"handle":"qa-1786b682662e","password":"****"}

--- response: 200 in 42 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-934d1fe9-08b4-41c3-a349-198bc971a2f0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 563
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2ee63990-ebd4-4371-9018-6aae0ebfe889"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-aeedeae2-7f9f-4703-af51-2e5e9f4ec95e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aeedeae2-7f9f-4703-af51-2e5e9f4ec95e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-756da669e4b6","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-aeedeae2-7f9f-4703-af51-2e5e9f4ec95e
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
Location: /v1/conversations/cnv_3267b943-2f85-467b-817e-ade191b9f3eb
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_3267b943-2f85-467b-817e-ade191b9f3eb","subject":"Error contract","status":"open","region":"eu","participants":["qa-1786b682662e","qa-756da669e4b6"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-21T09:57:09.198129386Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-a387c231-eaae-4156-a2f7-e89c45ebd168

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a387c231-eaae-4156-a2f7-e89c45ebd168
Content-Type: application/json

--- request body ---
{"handle":"qa-1786b682662e","password":"****","ttlSeconds":0}

--- response: 422 in 92 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a387c231-eaae-4156-a2f7-e89c45ebd168
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 547
RateLimit-Reset: 9
Content-Length: 294

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/auth/token","correlationId":"qa-a387c231-eaae-4156-a2f7-e89c45ebd168","errors":[{"field":"ttlSeconds","message":"1-3600"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-212191bc-49a8-4e27-92b5-3a63bd2a3c95

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-212191bc-49a8-4e27-92b5-3a63bd2a3c95
Content-Type: application/json

--- request body ---
{"handle":"qa-756da669e4b6","password":"****"}

--- response: 200 in 46 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-212191bc-49a8-4e27-92b5-3a63bd2a3c95
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 511
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c1aabc89-b2a7-4e1a-a027-14f974b253f2"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6c1a36c5-a7fa-4934-b7ce-6e7433730ca7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c1a36c5-a7fa-4934-b7ce-6e7433730ca7
Content-Type: application/json

--- response: 204 in 36 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6c1a36c5-a7fa-4934-b7ce-6e7433730ca7
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
correlation: qa-89d5b40b-bede-46e8-9302-1f6831bc8fe6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-89d5b40b-bede-46e8-9302-1f6831bc8fe6
Content-Type: application/json

--- request body ---
{"handle":"qa-756da669e4b6","password":"****"}

--- response: 401 in 38 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-89d5b40b-bede-46e8-9302-1f6831bc8fe6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 495
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-89d5b40b-bede-46e8-9302-1f6831bc8fe6"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-26bebe36-1496-4696-a032-a71cba7e4acb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26bebe36-1496-4696-a032-a71cba7e4acb
Content-Type: application/json

--- response: 204 in 31 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-26bebe36-1496-4696-a032-a71cba7e4acb
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
correlation: qa-c1fd978d-7641-42e8-8ff6-02ba302d2fae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1fd978d-7641-42e8-8ff6-02ba302d2fae
Content-Type: application/json

--- request body ---
{"handle":"qa-1786b682662e","password":"****"}

--- response: 401 in 16 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c1fd978d-7641-42e8-8ff6-02ba302d2fae
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 484
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c1fd978d-7641-42e8-8ff6-02ba302d2fae"}
```
